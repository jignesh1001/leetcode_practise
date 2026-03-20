class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        int[][] t = new int[m+1][n+1];

        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1;j++){
                if(char1[i-1] == char2[j-1]){
                    t[i][j] = 1+t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        int i = m,j=n;
        StringBuilder res = new StringBuilder();

        while(i > 0 && j > 0){
            if(char1[i-1] == char2[j-1]){
                res.append(char1[i-1]);
                i--;
                j--;
            }
            else if(t[i-1][j] > t[i][j-1]){
                res.append(char1[i-1]);
                i--;
            }
            else{
                res.append(char2[j-1]);
                j--;
            }
        }

        while(i > 0){
            res.append(char1[i-1]);
            i--;
        }
        while(j > 0){
            res.append(char2[j-1]);
            j--;
        }

        return res.reverse().toString();
    }
}