//Link -- https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        
        for(int i: nums1){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i: nums2){
            if(hs.containsKey(i)){
                int count = hs.get(i);
                
                if(count >= 1){
                    
                    list.add(i);
                    hs.put(i,count-1);
                    
                }else 
                    hs.remove(i);
            }
        }
        
        int arr[] = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
