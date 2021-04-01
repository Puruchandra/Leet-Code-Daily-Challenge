//LINK -- https://leetcode.com/problems/majority-element-ii/

//2-pointers
class Solution {    
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> _list = new ArrayList<Integer>();
        Arrays.sort(nums);
        
        int i = 0, ptr = 0;
        int n = nums.length;
        int _curr = Integer.MAX_VALUE;
        boolean _crossed = false;
        while(i<n && ptr<n){
            
            if(_curr == nums[ptr]){
                ptr++;
                if(ptr-i > n/3){
                    _crossed = true;
                }
            }else{
                if(ptr-i > n/3){
                    _list.add(_curr);
                }
                _curr = nums[ptr];
                i = ptr;
                _crossed = false;
            }
                
            
        }
        if(_crossed){
            _list.add(_curr);
        }
        return _list;
    }
}

