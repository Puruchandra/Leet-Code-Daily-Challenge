//LINK - https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        /*
          A Dyamic Programming approach
          
            create a master list _list
            run a loop row = 0 till row = 5
                create a local list ll
                for each row, run a loop from col = 0 till col <= row
                    for each col:
                       check col-1 are in the bounds of -1 to col.
                            if true add(_list.last().get(col-1) + _list.last().get(col))
                        else
                          add(1) to local list
                 add local list into master list
            at the end return masterlist
        */
        
        List<List<Integer>> _list = new ArrayList<List<Integer>>();
        
        
        for(int row = 0; row< numRows; row++){
            List<Integer> llist = new ArrayList<Integer>();
            
            for(int col = 0; col<row; col++){
                
                    if(col-1 > -1){
                        
                        int x = _list.get(row-1).get(col-1);
                        int y = _list.get(row-1).get(col);
                        llist.add(x+y); 
                        
                    }else{
                        llist.add(1);
                    }
                    
                }
            
                llist.add(1);
            
                _list.add(llist);
                    
            }
            
            
        return _list;
        }
       
    
}
