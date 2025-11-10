class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num = new HashSet<>();
        for(int n:nums1){
            num.add(n);
        }

        List<Integer> res = new ArrayList<>();
        for(int n:nums2){
            if(num.remove(n)){
                res.add(n);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for(int n:res){
            result[i] = n;
            i++;
        }
        return result;
    }
}