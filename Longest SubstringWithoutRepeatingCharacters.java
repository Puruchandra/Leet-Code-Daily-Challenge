//LINK --  https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        int start = 0;
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if(seen.containsKey(currChar)) {
                start = Math.max(seen.get(currChar) + 1, start);
            }
            seen.put(currChar, i);
            maxLen = Math.max(i - start + 1, maxLen);
        } 
        return maxLen;  
    }
} 
