class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int lvl = 0;

        for(char ch:s.toCharArray()){
            if(ch == '('){
                if(lvl > 0) result.append(ch);
                lvl++;
            }
            else if(ch == ')'){
                lvl--;
                if(lvl > 0) result.append(ch);
            }
        }
        return result.toString();
    }
}