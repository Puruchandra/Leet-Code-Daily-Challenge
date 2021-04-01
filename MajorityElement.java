// LINK -- https://leetcode.com/problems/majority-element/submissions/

//2-POINTERS APPROACH
class Solution {    
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        
        int ptr = 0;
        int _currVal = nums[0];
        
        
        for(int i = 0; i<nums.length && ptr < nums.length;){
            
            if(nums[ptr] == _currVal){
                ptr++;
            }else{
                if((ptr - i) > nums.length/2){
                    
                    break;
                }
                else{
                    
                    _currVal = nums[ptr];
                    i = ptr;
                    
                }
            }
        }
        
        return _currVal;
        
    }

}
