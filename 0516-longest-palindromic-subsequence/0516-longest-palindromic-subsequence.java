class Solution {
    public int longestPalindromeSubseq(String s) {
        String rs = new StringBuilder(s).reverse().toString();

        char[] schar = s.toCharArray();
        char[] rschar = rs.toCharArray();

        int m = s.length();
      

        int[][] t = new int[m+1][m+1];

      

        for(int i =1; i <m+1;i++){
            for(int j =1;j <m+1;j++){
                if(schar[i-1] == rschar[j-1]){
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        return t[m][m];
    }
}