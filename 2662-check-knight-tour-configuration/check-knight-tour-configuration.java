class Solution {
    boolean isValid(int grid[][], int r, int c, int n,int exValue){
        if(r<0||c<0||r>=n||c>=n|| grid[r][c]!=exValue){
            return false;
        }
        if(exValue==n*n-1){
            return true;
        }

        boolean ans1=isValid(grid,r-2,c+1,n,exValue+1);
        boolean ans2=isValid(grid,r-1,c+2,n,exValue+1);
        boolean ans3=isValid(grid,r+1,c+2,n,exValue+1);
        boolean ans4=isValid(grid,r+2,c+1,n,exValue+1);
        boolean ans5=isValid(grid,r+2,c-1,n,exValue+1);
        boolean ans6=isValid(grid,r+1,c-2,n,exValue+1);
        boolean ans7=isValid(grid,r-1,c-2,n,exValue+1);
        boolean ans8=isValid(grid,r-2,c-1,n,exValue+1);
        return ans1||ans2||ans3||ans4||ans5||ans6||ans7||ans8;

    }
    public boolean checkValidGrid(int[][] grid) {
        return isValid(grid,0,0,grid.length,0);
        
    }
}