class Solution {
    public int searchInsert(int[] nums, int target) {
        // ciel of an element in sorted array
        int start = 0, end = nums.length - 1;
        int res = nums.length;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target <= nums[mid]){
                res = mid;
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return res;
    }
}