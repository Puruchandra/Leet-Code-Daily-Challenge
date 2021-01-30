class Solution {
    
    /*  
        convert array into treeset, as finding an element takes O(1) 
        convert the array elements to even for the sake of simplicity
        max deviation in array would be diff of max and min element
        
        
        
    */
    
    
    
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> al=new TreeSet<Integer>();  
        
        
        
        for(int i : nums){
            
            if(i%2 == 1){
                al.add(i*2);
            }else{
                al.add(i);
            }
            
        }
        
        int diff = Integer.MAX_VALUE;
        
        while(true){
       
            
            int _max = al.last();
            int _min = al.first();
            
            int _curDiff = _max - _min;
            
            diff = Math.min(_curDiff, diff);
            
            if(_max % 2 == 0){
                
                al.remove(_max);
                al.add(_max/2);
                
            }else{
                
                return diff;
            }   
        }   
    }
    
}
