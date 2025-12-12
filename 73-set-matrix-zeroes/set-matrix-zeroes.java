class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
   
        boolean[][] marked = new boolean[m][n];

         for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                if(matrix[i][j] == 0){
                    marked[i][j] = true;
                }
            }
        }
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                if(marked[i][j]){
                    rowZero(i,matrix);
                    colZero(j,matrix);
                }
            }
        }
       
    }
    public void rowZero(int row,int[][] matrix){
        int n = matrix[0].length;
        for(int j = 0; j < n;j++ ){
            matrix[row][j] = 0;
        }
    }
    public void colZero(int col,int[][] matrix){
        int m = matrix.length;
        for(int i = 0; i < m;i++ ){
                matrix[i][col] = 0;
            
        }
    }
}