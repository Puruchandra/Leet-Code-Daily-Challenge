//LINK - https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int     cnt = k;
        
        for( int n : nums )
        {
            if( n == 1 && cnt < k )
            {
                return false;
            }
            cnt = (n == 1) ? 0 : cnt + 1;
        }
		
        return true;
    }
}
