import java.util.Arrays;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        //  O(n * log(K)) time and O(K) space
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num:nums){
            pq.add(num);

            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}