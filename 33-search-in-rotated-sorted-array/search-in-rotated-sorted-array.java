class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length -1;
         int pivot = min(nums);
        int first = bs(nums,start,pivot-1,target);
        int second = bs(nums,pivot,end,target);

         return (first != -1) ? first : second;
    
    }
    public int bs(int[] arr,int start,int end,int target){
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
               end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public int min(int[] arr){
      int start = 0,end = arr.length - 1;
      while(start <= end){
        if(arr[start] <= arr[end]) return start;
        int mid = start + (end - start)/2;
        if(arr[mid] <= arr[end]){
            end = mid;
        }
        else{
            start = mid + 1;
        }
      }
    return 0;
    }

}