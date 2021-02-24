/*
  LINK - https://leetcode.com/problems/maximum-subarray

  This problem uses Kadane's Alogrithm.
  Kadane's algo overview - https://www.youtube.com/watch?v=86CQq3pKSUw&ab_channel=CSDojo 

*/


class Solution {
    
    public int maxSubArray(int[] nums) {
        
        int maxGlobal = nums[0];
        int maxLocal = nums[0];
        
        for(int i = 1; i<nums.length;i++){
            
            maxLocal = Math.max(nums[i], maxLocal+nums[i]);
            
            if(maxGlobal < maxLocal)
                maxGlobal = maxLocal;
            
            
        }
        
        
        return maxGlobal;
        
    }
}
