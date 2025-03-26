class Solution {
    boolean isSafe(char[][] board, int row, int col, char dig) {
        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == dig) {
                return false;
            }
        }

        // Check column
        for (int j = 0; j < 9; j++) {
            if (board[j][col] == dig) {
                return false;
            }
        }

        // Check 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == dig) {  // Fix: Use (i, j) instead of (sr, sc)
                    return false;
                }
            }
        }
        return true;
    }

    boolean helper(char[][] board, int row, int col) {
        if (row == 9) { // Base case: If we reach row 9, Sudoku is solved
            return true;
        }

        int nextRow = row, nextCol = col + 1;
        if (nextCol == 9) {  // Move to the next row after the last column
            nextRow = row + 1;
            nextCol = 0;
        }

        if (board[row][col] != '.') {  // If already filled, move to next cell
            return helper(board, nextRow, nextCol);
        }

        // Try placing digits 1-9
        for (char dig = '1'; dig <= '9'; dig++) {
            if (isSafe(board, row, col, dig)) {
                board[row][col] = dig;  // Place digit
                if (helper(board, nextRow, nextCol)) {
                    return true;  // If successful, return true
                }
                board[row][col] = '.';  // Backtrack if solution fails
            }
        }
        return false;  // No valid digit found, backtrack
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
