//LINK - https://leetcode.com/problems/sort-colors/submissions/

class Solution {
    
    /*
        
        [2,0,2,1,1,0]
        
        loop through array and count 1s, and 0s
        
        loop through array replace with number of 0s , 1s ,2s
        
    
    
    */
    
    public void sortColors(int[] nums) {
        
        
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        
        for(int i = 0; i< nums.length; i++){
            
            if(nums[i] == 0)
                zeros++;
            
            if(nums[i] == 1)
                ones++;
            
            if(nums[i] == 2)
                twos++;
            
        }
        
        for(int i = 0; i< nums.length; i++){
            if(zeros > 0){
                nums[i] = 0;
                zeros--;
            }else if(ones>0){
                nums[i] = 1;
                ones--;
            }else
                nums[i] = 2;
        }
        
        
    }
}
