// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//           HashSet<Integer> set = new HashSet<>();
//           for(int num: nums){
//             if(!set.add(num))
//                return true;
//           }
//           return false;
//     }
// }

class Solution{
     public boolean containsDuplicate(int[] nums){
           HashMap<Integer,Integer> map = new HashMap<>();
           for(int num:nums){
             if(map.containsKey(num)){
                return true;
             }
             map.put(num,Arrays.asList(nums).indexOf(num));
           }
           return false;
     }
}