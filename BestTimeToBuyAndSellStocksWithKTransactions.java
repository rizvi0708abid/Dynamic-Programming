class Solution {
    public int maxProfit(int k, int[] prices) {
       
      if(k==0 || prices==null || prices.length < 2) return 0;  
        
      int dp[][] = new int[k+1][prices.length];
        
        for(int i = 1 ; i< dp.length ; i++) {
            int maxDiff = -prices[0];
            for(int j =1 ; j<dp[0].length ; j++) {
                dp[i][j] = Math.max(dp[i][j-1], prices[j]+maxDiff);
                maxDiff = Math.max(dp[i-1][j]- prices[j],maxDiff);
            }
            
        }
        return dp[k][prices.length-1];
    }
}
