class Solution {

    static int[][] t= new int[1001][1001];
    public int longestCommonSubsequence(String text1, String text2) {
         int n = text1.length();
         int m = text2.length();

         for(int i = 0;i< t.length;i++){
            for(int j = 0; j< t[0].length;j++){
                t[i][j] = -1;
            }
         }
         return lcs(text1,text2,n,m);
    }

    public int lcs(String text1, String text2,int n,int m){
        if(n == 0 || m == 0){
            return 0;
        }
        if(t[n][m] != -1){
            return t[n][m];
        }
        if(text1.charAt(n-1) == text2.charAt(m-1)){
            return t[n][m] = 1+lcs(text1,text2,n-1,m-1);
        }
        else{
            return t[n][m] = Math.max(lcs(text1,text2,n,m-1),lcs(text1,text2,n-1,m));
        }
    }

}