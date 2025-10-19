class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(int i = 0; i < strs.length;i++){
            if(visited[i]) continue;

            List<String> inner = new ArrayList<>();
            inner.add(strs[i]);
            visited[i] = true;

            for(int j = i+1; j < strs.length;j++){
                if(!visited[j] && isAnagram(strs[i],strs[j])){
                    inner.add(strs[j]);
                    visited[j] = true;
                }
            }
            result.add(inner);
        } 
       
        return result;
    }

    public static boolean isAnagram(String t, String s){
        if(s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr,tArr);
    }
}