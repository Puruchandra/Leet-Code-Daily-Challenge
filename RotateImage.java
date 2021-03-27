//Link - https://leetcode.com/problems/rotate-image/submissions/

//Inficient approach in terms of memory, it requires n^2 space
// class Solution {

    
//     public void rotate(int[][] matrix) {
        
//         int colLength = matrix[0].length;
        
//         int[][] arr = new int[colLength][colLength];
        
//         int res[][] = new int[colLength][colLength];
        
//         for(int i = 0; i < colLength; i++){
            
//             int[] temp = new int[colLength];
//             int counter = 0;
            
//             for(int j = colLength-1; j >= 0; j--){
//                 temp[counter] = matrix[j][i];
//                 counter++;
            
//             }
//             res[i] = temp;
            
            
//         }
//         for(int i=0;i<colLength;i++){
//             matrix[i] = res[i];
//         }
//     }
// }


//Approach -- Transpose the given matrix --> Reverse the Transposed matrix
class Solution {

    /*

    a00  a01
    a10  a11
    
    a00 a10  -->  a10 a00
    a01 a11       a11 a01
    
    a10  a00       a00 a01 a02
    a11  a01       a10 a11 a12     
                   a20 a21 a22
    
    ex -- 1 2 3   [1,2,3] [4,5,6] [7,8,9]   => [1,4,7] [2,5,8] [3,6,9]  =>  1 4 7
          4 5 6                                                             2 5 8   
          7 8 9                                                             3 6 9   
                   
          1 4    [1,4] [2,5]  =>  [4,1] [5,2]
          2 5
    */
    
    public void rotate(int[][] matrix) {
        
         transpose(matrix, matrix.length);
         reverse(matrix, matrix.length);
        
    }
    
    public static void transpose(int[][] matrix, int len){
        
        for(int i=0; i<len; i++){
            for(int j = i; j<len; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;   
            }
        }
        
    }
    
    public static void reverse(int[][] matrix, int len){
        for(int i=0; i<len; i++){
            for(int j = 0; j < len/2; j++){
                int temp = matrix[i][j];
                matrix[i][j]  = matrix[i][len-j-1];
                matrix[i][len-j-1] = temp;
            }   
        }
    }
    
    
}


