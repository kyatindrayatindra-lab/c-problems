class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE,sell=0;
        for(int each:prices){
            buy = Math.min( each,buy);
            sell = Math.max(sell,each-buy);
        }
        return sell;
    }
}
