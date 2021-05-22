//  LINK -- https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> _set = new HashSet<Integer>();
        
        for(int v : nums){
            _set.add(v);
        }
        
        int longestStreak = 0;
        
        for(int val : _set) {
           if(!_set.contains(val-1)){
            
            int currNum = val;
               int streak = 1;
           
            
            while(_set.contains(currNum+1)){
                streak++;
                currNum++;
            }
            longestStreak = Math.max(streak, longestStreak);
           }
            
            
        }
        return longestStreak;
    }
}
