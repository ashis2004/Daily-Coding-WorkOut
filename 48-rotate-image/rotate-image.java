class Solution {
    public void rotate(int[][] matrix) {
      int n=matrix.length;
      for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
      }
      for(int i=0;i<n;i++){
        int l=0,right=n-1;
        while(l<right){
            int temp=matrix[i][l];
            matrix[i][l]=matrix[i][right];
            matrix[i][right]=temp;
            l++;
            right--;
        }
      }
    }
}
