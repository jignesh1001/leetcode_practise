class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> max = new PriorityQueue<>(
             (a, b) -> {
                if (a[0] == b[0]) return b[1] - a[1];
                return b[0] - a[0];
            }
        );
        
        for(int v:arr){
            max.add(new int[]{Math.abs(v-x),v});
            if(max.size() > k){
                max.poll();
            }
        }

        List<Integer> res = new ArrayList<>();

        while(max.size() >0){
            res.add(max.poll()[1]);
            
        }
        Collections.sort(res);
        return res;

    }
}