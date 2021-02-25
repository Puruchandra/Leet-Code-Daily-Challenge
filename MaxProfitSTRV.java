class Solution {
    public int maxProfit(int[] prices) {
        
    }
}
/*  
    Brute Force Solution -
    T.C - 0(n^2) - Would be TLE for big numbers
      
    class Solution {
    public int maxProfit(int[] prices) {
        
        int maxP = 0;
        
        for(int i = 0; i < prices.length; i++){
            for(int j = i ; j < prices.length; j++){
                
                if(i != j){
                    
                
                int lsum = prices[j] - prices[i];
                
                maxP = Math.max(lsum, maxP);
                }
            }
        }
        
        
        return maxP;
    }
}

*/
