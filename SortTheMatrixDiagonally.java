/*
          APPROACH - 
          The approach is simple. We pick diagonal elements and sort it and then rearrange their positions.
          QUESTION LINK - https://leetcode.com/problems/sort-the-matrix-diagonally/submissions/
        
*/


class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        
        
        int m = mat.length;
        int n = mat[0].length;
        
        for(int col=0; col < n; col++){
            
            sort(mat, 0, col, m, n);
            
        }
        
        for(int row = 1; row < m; row++){
            sort(mat, row, 0, m, n);
            
        }
        
        return mat;
    }
    
    void sort(int[][] mat, int row, int col, int m, int n){
        
        List<Integer> list = new ArrayList();
        int r = row;
        int c = col;
        while(r<m && c<n){
            list.add(mat[r][c]);
            r++;
            c++;
        }
        
        Collections.sort(list);
        
        int index = 0;
        r = row;
        c = col;
        
        while(r<m && c<n){
            mat[r][c] = list.get(index++);
            r++;
            c++;
        }
    }
}
