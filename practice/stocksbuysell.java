public class stocksbuysell {
    public static void main(String args[]){
        stocksbuysell sbs=new stocksbuysell();
        // sbs.buy_sell_once();
        int stock_prices[]={7,1,5,3,6,4};
        int n=stock_prices.length;
        System.out.println(stocksbuysell.buy_sell_many(0, 1, stock_prices, n));
    }
    public static void buy_sell_once(){
        int stock_prices[]={7,8,1,2,5,6,4,1};
        int n=stock_prices.length;
        int min=stock_prices[0],profit=0,sell_diff;
        for(int i=1;i<n;i++){
            sell_diff=stock_prices[i]-min;
            profit=Math.max(profit,sell_diff);
            min=Math.min(min,stock_prices[i]);
        }
        System.out.println("The max profit is :"+profit);
    }
    public static int buy_sell_many(int idx,int buy,int prices[],int n){
        int profit=0;
        if(idx==n){
            return 0;
        }
        if(buy==1){
            profit+=Math.max(-prices[idx]+buy_sell_many(idx+1,0, prices,n),buy_sell_many(idx+1, 1, prices, n) );
        }
        else{
            profit+=Math.max(prices[idx]+buy_sell_many(idx+1,1,prices,n), buy_sell_many(idx+1,0, prices, n));
        }
        return profit;
    }
}
