class Solution {
    public int minDistance(String word1, String word2) {
    
        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();

        int m = word1.length();
        int n = word2.length();

        int[][] t = new int[m+1][n+1];

        // for(int i = 0; i < m+1;i++){
        //     for(int j = 0; j < n+1;j++){
        //         if(i == 0 || j == 0){
        //             t[i][j] = 0;
        //         }
        //     }
        // }

        for(int i =1; i < m+1; i++){
            for(int j =1; j < n+1;j++){
                if(str1[i-1] == str2[j-1]){
                    t[i][j] = 1+ t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        return (m-t[m][n]+n-t[m][n]);
    }
}