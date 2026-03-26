class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> min = new PriorityQueue<>(
            (a,b)->{
                if(a[1] == b[1]) return b[0] - a[0];
                return a[1] - b[1];
            }
        );

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            min.add(new int[]{entry.getKey(),entry.getValue()});
        }
        int[] res = new int[nums.length];
        int idx = 0;
        while(min.size() > 0){
          int[] top = min.poll();
         int key = top[0];
         int freq = top[1];

            for(int i = 0 ;i < freq;i++){
                res[idx++] = key;
            }
        }

        return res;
    }
}