class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] marked = new boolean[m][n];

        for(int i = 0; i < m;i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    marked[i][j] = true;
                }
            }
        }
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                if(marked[i][j]){
                    zeroRow(i,matrix);
                    zeroCol(j,matrix);
                }
            }
        }
    }
    public void zeroRow(int row,int[][] matrix){
        int n = matrix[0].length;
        for(int i = 0; i < n;i++){
            matrix[row][i] = 0;
        }
    }
    public void zeroCol(int col,int[][] matrix){
        int m = matrix.length;
        for(int j = 0; j < m;j++){
            matrix[j][col] = 0;
        }
    }
}