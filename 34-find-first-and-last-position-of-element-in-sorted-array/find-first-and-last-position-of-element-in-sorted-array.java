class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = leftBound(nums,target);
        int last = rightBound(nums,target);

        return new int[]{first,last};
    }
    private int leftBound(int nums[],int target){
        int res = -1,left = 0,right=nums.length-1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                res = mid;
                right = mid -1;
            }
            else if(nums[mid] < target){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        return res;
    }
     private int rightBound(int nums[],int target){
        int res = -1,left = 0,right=nums.length-1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                res = mid;
                left = mid +1;
            }
            else if(nums[mid] < target){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        return res;
    }
}