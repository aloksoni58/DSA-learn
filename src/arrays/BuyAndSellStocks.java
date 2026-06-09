package arrays;

public class BuyAndSellStocks {
	
	public static void buyAndSellStocks(int[] prices) {
		
		int buyPrice = Integer.MAX_VALUE;
		int maximumProfit = 0;
		
		for(int i = 0; i < prices.length; i++) {
			if(buyPrice < prices[i]) {//profit
				int profit = prices[i] - buyPrice;//today's profit
				maximumProfit = Math.max(maximumProfit, profit);
			}
			else {
				buyPrice = prices[i];
			}
		}
		
		System.out.println("Maximum profit achives is: " + maximumProfit);
	}
	
}
