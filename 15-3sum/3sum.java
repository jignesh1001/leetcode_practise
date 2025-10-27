class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> hashSet = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);
                if (hashSet.contains(third)) {
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], third));
                    Collections.sort(temp);
                    st.add(temp);
                }
                hashSet.add(nums[j]);
            }

        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(st);
        return ans;
    }
}