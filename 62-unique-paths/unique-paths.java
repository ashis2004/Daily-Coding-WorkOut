class Solution {
    public int uniquePaths(int m, int n) {
        // Create a 2D array to store the subproblem solutions
        int[][] dp = new int[m][n];

        // Initialize the first row to 1, as there is only one way to reach any cell in the first row
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 1;
        }

        // Initialize the first column to 1, as there is only one way to reach any cell in the first column
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }

        // Populate the rest of the array by summing the paths from the cell above and the cell to the left
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // The result is stored in the bottom-right cell of the array
        return dp[m - 1][n - 1];
    }
}
