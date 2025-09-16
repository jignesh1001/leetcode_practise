class Solution {

    // public void setZeroes(int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     boolean hasZero = false;

    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (matrix[i][j] == 0) {
    //                 hasZero = true;
    //                 markRow(i, n, matrix);
    //                 markCol(j, m, matrix);
    //             }

    //         }
    //     }

    //     if (hasZero) {
    //         for (int i = 0; i < m; i++) {
    //             for (int j = 0; j < n; j++) {
    //                 if (matrix[i][j] == -1) {
    //                     matrix[i][j] = 0;
    //                 }
    //             }
    //         }
    //     }

    // }

    // public void markRow(int row, int n, int[][] matrix) {
    //     for (int j = 0; j < n; j++) {
    //         if (matrix[row][j] != 0) {
    //             matrix[row][j] = -1;
    //         }
    //     }
    // }

    // public void markCol(int col, int m, int[][] matrix) {
    //     for (int i = 0; i < m; i++) {
    //         if (matrix[i][col] != 0) {
    //             matrix[i][col] = -1;
    //         }
    //     }
    // }

    public void setZeroes(int [][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        int[] columns = new int[m];
        int[] rows = new int[n];

        for(int i = 0; i < n;i++){
            for(int j = 0; j < m;j++){
                if(matrix[j][i] == 0){
                    columns[j] = 1;
                    rows[i] = 1;
                }
            }
        }
          for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                if(columns[i] == 1 || rows[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
    
}