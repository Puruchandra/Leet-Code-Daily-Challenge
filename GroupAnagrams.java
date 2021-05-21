//link -- https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<List<String>>();
        
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
        
        for(String str : strs){
            String temp = sortString(str);
            if(!hm.containsKey(temp)){
                List<String> li = new ArrayList<String>();
                li.add(str);
                hm.put(temp,li);
                
            }else{
                hm.get(temp).add(str);
            }
        }
        
        for(Map.Entry m : hm.entrySet()){
            list.add((ArrayList)m.getValue());
        }
        
        return list;
    }
    
    String sortString(String s){
            char[] c = s.toCharArray();    
            Arrays.sort(c);    
            String newStr = String.valueOf(c);
        return newStr;
    }
}
