// link -- https://leetcode.com/problems/find-common-characters/

class Solution {
    public List<String> commonChars(String[] A) {
        
        List<String> result = new ArrayList <>();
        HashMap <Character, Integer> map = new HashMap<>();
        HashMap <Character, Integer> tempMap = new HashMap<>();
        int length = A.length;
    
        //Store count for the first word
        for( int i =0 ; i < A[0].length(); i++)
        {
            char c = A[0].charAt(i);
            
            if( map.get(c) == null )
                map.put(c,1);
            else
                map.put(c, map.get(c) +1);
        }
        
         //Compare previous hashmap with the current hashmap
        for( int i = 1; i < length; i++)
        {   
            for( int j = 0; j < A[i].length(); j++)
            {
                char c = A[i].charAt(j);
                
                // Add into hashmap only characters that exist in the current word and 
                // previous word
                if( tempMap.get(c) == null && map.get(c) != null)
                    tempMap.put(c,1);
                else
                {
                    // Example ["Look", "LOL"] 
                    // Second Element will only add 1 L into its hashmap, no point of adding 2 L because
                    // the first Element does not have 2 L.
                    if( tempMap.get(c) != null && tempMap.get(c) < map.get(c) )
                        tempMap.put(c, tempMap.get(c) +1);
                }    
            }
            //Update the maps
            map =  new HashMap<>(tempMap);
            tempMap.clear();  
        }
        
    //Iterate through the most updated hashmap and add results to list
        Iterator it = map.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        int repeat = (int)pair.getValue();    
            while( repeat > 0)
            {
                result.add(String.valueOf(pair.getKey()));
                repeat--;
            }
        }
        return result;
    }
}
