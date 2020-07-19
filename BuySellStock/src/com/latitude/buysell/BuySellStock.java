package com.latitude.buysell;

public class BuySellStock {

	public static void main(String[] args) {
		 double[] priceArray = { 10, 7, 5, 8, 11, 9 };
		//double[] priceArray = {17, 11, 60, 25, 150, 75, 31, 120};
		//double[] priceArray = { 0, 5, 6, 9, 0, 0 };
		System.out.println("Maximum profit::" + getMaxProfit(priceArray));

	}

	private static double getMaxProfit(double[] priceArray)
	{
		  double bestProfitSoFar = Double.NEGATIVE_INFINITY;
		  double lowestPriceSoFar = priceArray[0];

		  for (int i = 1; i < priceArray.length; i++) {
		    double purchase = lowestPriceSoFar;
		    double sale = priceArray[i];
		    double profit = sale - purchase;

		    lowestPriceSoFar = Math.min(lowestPriceSoFar, sale);
		    bestProfitSoFar = Math.max(bestProfitSoFar, profit);
		    System.out.println("Buy at ::" + purchase + " Sell at:" + sale + " profit::"+ profit);
		  }
		  
		  return bestProfitSoFar;
	}
	
}
	

