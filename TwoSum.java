//LINK -- https://leetcode.com/problems/two-sum/

class Solution {
    
    public int[] twoSum(int[] nums, int target) {
    
        int[] res = new int[2];
        
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int counter = 0;
        for(int val : nums){
            hm.put(val, counter);
            counter++;
        }
        
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(hm.containsKey(diff) && hm.get(diff) != i){
                return new int[] { i, hm.get(diff) };
            }
        
         
        }
        throw new IllegalArgumentException("No two sum solution");
    
    }
  
//Hashing - one pass
//   public int[] twoSum(int[] nums, int target) {
//     Map<Integer, Integer> map = new HashMap<>();
//     for (int i = 0; i < nums.length; i++) {
//         int complement = target - nums[i];
//         if (map.containsKey(complement)) {
//             return new int[] { map.get(complement), i };
//         }
//         map.put(nums[i], i);
//     }
//     throw new IllegalArgumentException("No two sum solution");
// }
}
