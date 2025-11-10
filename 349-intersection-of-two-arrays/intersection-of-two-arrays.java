class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersection(nums2,nums1);
        }
        Set<Integer> set1 = new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
         List<Integer> resultList = new ArrayList<>();

         for (int n : nums2) {
            if (set1.remove(n)) {  
                resultList.add(n);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}