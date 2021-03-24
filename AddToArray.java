LINK - https://leetcode.com/problems/add-to-array-form-of-integer/submissions/

class Solution {
    
    
    
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<Integer>();
        
        int n = A.length;
        int carry = K;
        while(--n >= 0 || carry > 0){
            if (n >= 0)
                carry+= A[n];
            res.add(carry % 10);
            carry /= 10;
            
        }
        
        Collections.reverse(res);
        return res;
    }
}
