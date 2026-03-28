class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = first(nums,target);
        int last = last(nums,target);
        return new int[]{first,last};
    }
    public int first(int[]nums,int target){
        int left = 0;
        int right = nums.length-1;
        int res = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(target == nums[mid]){
                res = mid;
                right = mid-1;
            }
            else if(target < nums[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return res;
    }
     public int last(int[]nums,int target){
        int left = 0;
        int right = nums.length-1;
        int res = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(target == nums[mid]){
                res = mid;
                left = mid+1;
            }
            else if(target < nums[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return res;
    }
}