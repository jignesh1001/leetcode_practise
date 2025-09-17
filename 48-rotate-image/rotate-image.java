class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp;
       for(int i = 0 ; i <= n-2; i++){
         for(int j = i + 1; j < n;j++){
            temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
         }
       }

        for (int i = 0; i < n; i++) {
             reverse(matrix[i]);
        }
    }

    public static void reverse(int arr[]){
        int left = 0;
        int right = arr.length -1;
        int temp;
        while(left < right){
           temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           left++;
           right--;
        }
    }
}