LINK -- https://leetcode.com/problems/set-matrix-zeroes/

BRUTE FORCE APPROACH

class Solution {
    public void setZeroes(int[][] matrix) {
        
        Map<Integer, Integer> zMap = new HashMap<Integer, Integer>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i=0; i<m; i++){
            
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    zMap.put(i,j);
                    
                }
            }
        }
        
        
    for(Map.Entry _entry : zMap.entrySet()){    
            
            int row = (int)_entry.getKey();
            int col = (int)_entry.getValue();
        
            for(int i=0; i<m; i++){
                
                matrix[i][col] = 0;
            }
        
            for(int i=0; i<n; i++){
                matrix[row][i] = 0;
            }
        
        }
        
        
    }
    
    
}
