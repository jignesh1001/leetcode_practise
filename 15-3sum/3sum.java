class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> tempSet = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int temp = -(nums[i] + nums[j]);
                if (tempSet.contains(temp)) {
                    List<Integer> result = new ArrayList<>(Arrays.asList(nums[i], nums[j], temp));
                    Collections.sort(result);
                    st.add(result);
                }

                tempSet.add(nums[j]);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        res.addAll(st);
        return res;
    }
}