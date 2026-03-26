class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
           map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> min = new PriorityQueue<>(
            (a,b)->{
                if(a[0] == b[0])return a[1] - b[1];
                return a[0] - b[0];
            }
        );

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            min.add(new int[]{entry.getValue(),entry.getKey()});
            if(min.size() >k){
                min.poll();
            }
        }

        int[] res = new int[k];
        int i = 0;
        while(min.size() >0){
            res[i] = min.poll()[1];
            i++;
        }
        
        return res;
    }
}