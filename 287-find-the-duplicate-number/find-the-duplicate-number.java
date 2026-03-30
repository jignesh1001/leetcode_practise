class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        if(map.size() == 1){
            return nums[0];
        }
        for(Map.Entry entry:map.entrySet()){
            if((int)entry.getValue() >= 2){
                return (int)entry.getKey();
            }
        }
        return nums[0];
    }
}