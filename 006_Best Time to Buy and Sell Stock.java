class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int max = 0;
        for(int i = 1; i < prices.length; i++){
            if(buy <= prices[i]){
                int profit = prices[i] - buy;
                max = Math.max(max,profit);
            }
            else{
                buy = prices[i];
            }
        }
        return max;
    }
}
