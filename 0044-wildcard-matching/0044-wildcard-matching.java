class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        char[] schar = s.toCharArray();
        char[] pchar = p.toCharArray();

        boolean[][] t = new boolean[m+1][n+1];
         
        t[0][0] = true;

        for (int j = 1; j <= n; j++) {
            if (pchar[j-1] == '*') {
                t[0][j] = t[0][j - 1];
            }
        }

        for(int i =1; i < m+1;i++){
            for(int j=1;j < n+1;j++){
                if((schar[i-1] == pchar[j-1]) || pchar[j-1] == '?'){
                    t[i][j] = t[i-1][j-1];
                }
                else if(pchar[j-1] == '*'){
                    t[i][j] = t[i-1][j] || t[i][j-1];
                }
                else{
                    t[i][j] = false;
                }
            }
        }

        return t[m][n];
    }
}