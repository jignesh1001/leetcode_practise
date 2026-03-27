class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> b.num - a.num
        );

        for(int[] point: points){
            int distance = (point[0]*point[0] + point[1]*point[1]);
            pq.add(new Pair(point,distance));
            if(pq.size() > k){
                pq.poll();
            }
        } 
        int res[][] = new int[k][2];
        int i =0;
        while(pq.size()>0){
            res[i] = pq.poll().arrVal;
            i++;
        }

        return res;
    }
    class Pair {
    int[] arrVal;
    int num;

    Pair(int[] arrVal, int num) {
        this.arrVal = arrVal;
        this.num = num;
    }
}
}