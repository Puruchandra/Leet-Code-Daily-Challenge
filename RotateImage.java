//Link - https://leetcode.com/problems/rotate-image/submissions/

//Inficient approach in terms of memory, it requires n^2 space
class Solution {

    
    public void rotate(int[][] matrix) {
        
        int colLength = matrix[0].length;
        
        int[][] arr = new int[colLength][colLength];
        
        int res[][] = new int[colLength][colLength];
        
        for(int i = 0; i < colLength; i++){
            
            int[] temp = new int[colLength];
            int counter = 0;
            
            for(int j = colLength-1; j >= 0; j--){
                temp[counter] = matrix[j][i];
                counter++;
            
            }
            res[i] = temp;
            
            
        }
        for(int i=0;i<colLength;i++){
            matrix[i] = res[i];
        }
    }
}
