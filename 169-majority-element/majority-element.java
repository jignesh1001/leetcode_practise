class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> countNums = new HashMap<>();

        for(int i = 0; i < nums.length;i++){
            countNums.put(nums[i],countNums.getOrDefault(nums[i],0)+1);
        }
         
        List<int[]> arr = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry: countNums.entrySet()){
             arr.add(new int[]{entry.getValue(),entry.getKey()});
        }

         arr.sort((a,b) -> b[0] - a[0]);

        return arr.get(0)[1];

    }
    
}