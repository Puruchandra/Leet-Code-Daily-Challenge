//LINK - https://leetcode.com/problems/merge-intervals

class Solution {
    
    /*  
        initialize a currMergableArray with intervals[0]
        run a loop from 1 to intervals.length
        check if the array at currMergableArray overlaps array at i
            if true merge, update currMergableArray with newly merged
            else update currMergableArray with array at i
                
    
    */
    
    
    public int[][] merge(int[][] intervals) {
    
        
        Arrays.sort(intervals, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                    return Integer.compare(a[0], b[0]);
             }});
        
        ArrayList<int[]> list = new ArrayList<>();
        
        int[] currMergableArray = intervals[0];
            
        if(intervals.length <= 1){
            return intervals;
        }
        
        for(int i=1; i<intervals.length; i++){
            
            if(isMergable(currMergableArray, intervals[i])){
                
                int[] merged = new int[]{ currMergableArray[0], Math.max(intervals[i][1], currMergableArray[1]) };
                currMergableArray = merged;
                list.add(currMergableArray);
                
            }else{
                if(i == 1){
                    list.add(currMergableArray);    
                }
                list.add(intervals[i]);
                currMergableArray =  intervals[i];
            }
            
            
        }
        
        
        // 
        int[][] res = new int[list.size()][2]; 
        int i = 0;
        for(int[] arr : list){
            res[i] = arr;
            i++;
        }
        return res;
        
    }
    
    
    public static boolean isMergable(int[] array1, int[] array2){
        
        if(array2[0] <= array1[1]){
            
            return true;
        }
        return false;
        
    }
}
