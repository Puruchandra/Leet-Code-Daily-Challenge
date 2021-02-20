//LINK - https://leetcode.com/problems/merge-sorted-array/submissions/


class Solution {

        /*
        
        
        
        
        
            Define one pointers in each array i, j at 0th index
            compare the value of both pointers
            if i <= j, the value at i is already at right place
                move i, and hold j
            else 
                insert the value of pointer j in array1
                move i and j
            repeat until i and j reaches end


        */
        
        
        /*
            Another approach
            replace the array items in nums1 after pos m
            sort the array
            
            
        */


        public void merge(int[] nums1, int m, int[] nums2, int n) {
        
           int counter = 0;
        for(int i=0; i<m+n && n>0 ; i++){
            
            if(i<m){
                continue;
            }else{
                nums1[i] = nums2[counter];
                counter++;
            }
            
        
        }
            
        
                     
        Arrays.sort(nums1);
        }

    }
