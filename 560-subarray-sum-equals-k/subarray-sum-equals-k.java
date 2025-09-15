class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1); 
        int count = 0, sum = 0;

        for (int num : nums) {
            sum += num;
            int rem = sum - k;

            if (preSum.containsKey(rem)) {
                count += preSum.get(rem); // add all possible subarrays
            }

            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1); // store freq
        }

        return count;
    }
}
