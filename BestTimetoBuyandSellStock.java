https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//Brute force Approach

class Solution {
    //Sorting the remainder array elements to get the maximum
    static int maxVal(int []arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public int maxProfit(int[] prices) {
        int maxProfit = 0 ;
        for(int i = 0 ; i < prices.length-1 ; i++) {
            int max = maxVal(Arrays.copyOfRange(prices,i+1, prices.length));
            //getting the max profit for each day when there is really a profit
            if(max > prices[i]) {
                maxProfit = (max-prices[i] > maxProfit) ? max-prices[i] : maxProfit;
            }else{
                continue;
            } 
        }
        //maxProfit holds the maximum profit 
        return maxProfit;
    }
}
