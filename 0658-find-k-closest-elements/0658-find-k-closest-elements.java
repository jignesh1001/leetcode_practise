class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> max = new PriorityQueue<>(
             (a, b) -> {
                if (a.dist == b.dist) return b.value - a.value;
                return b.dist - a.dist;
            }
        );
        
        for(int v:arr){
            max.add(new Pair(Math.abs(v-x),v));
            if(max.size() > k){
                max.poll();
            }
        }

        List<Integer> res = new ArrayList<>();

        while(max.size() >0){
            res.add(max.poll().value);
            
        }
        Collections.sort(res);
        return res;

    }
     static class Pair {
        int dist;
        int value;

        Pair(int dist, int value) {
            this.dist = dist;
            this.value = value;
        }
    }
}