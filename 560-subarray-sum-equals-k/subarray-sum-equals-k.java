class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1); 
        int sum = 0, count = 0;

        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
            int rem = sum - k;
            if(preSum.containsKey(rem)){
                count += preSum.get(rem);
            }
            preSum.put(sum,preSum.getOrDefault(sum,0) + 1);
        }
        return count;
    }
}
