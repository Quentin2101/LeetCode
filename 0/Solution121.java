public class Solution121 {
    public int maxProfit(int[] prices) {
        int investement = prices[0];
        int profit_max = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < investement) {
                investement = prices[i];
            }
            else  if (prices[i] - investement > profit_max) {
                profit_max = prices[i] - investement;
            }
        }
        return profit_max;
    }
}
