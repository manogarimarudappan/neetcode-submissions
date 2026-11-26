class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxProfit = 0;
        //Idea is maintaining the minimum number (buyPrice) at l and Max price(SellPrice) at r. if l < r, means making profit. so calculate. if l> r, then replace l with r.
        //Else (prices[l] >= prices[r]): the current price prices[r] is lower than (or equal to) the buy price, so it can never be beaten by keeping the old l. Move l to r, making the new lower price the candidate buy day.

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                l = r;
            }
            r++;
        }
        return maxProfit;
    }
}
