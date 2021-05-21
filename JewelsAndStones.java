//Link -- https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     
        
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        
        for(int i = 0; i< stones.length(); i++){
            char c = stones.charAt(i);
            
            hm.put(c, hm.getOrDefault(c,0)+1);
            
        }
        int count = 0;
        for(int i = 0; i< jewels.length(); i++){
            char j = jewels.charAt(i);
            if(hm.containsKey(j)){
                 count += hm.get(j);
            }
        }
        
        return count;
    }
}
