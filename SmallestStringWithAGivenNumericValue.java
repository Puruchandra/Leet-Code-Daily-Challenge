//link - https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/

class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        
        while(n != 0){
            int i = 26;
            
            while(k-i < n-1) i--; // trying to substract the max number from k unitl we have atleast n-1 left to fill a's in the remaining places
            
            k-= i;
            sb.append((char)('a'+(i-1)));
            n--;
            
        }
        return sb.reverse().toString();
    }
}
