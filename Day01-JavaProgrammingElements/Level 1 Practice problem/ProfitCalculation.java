// Create ProfitCalculation Class to calculate the profit and loss
class ProfitCalculation{
	public static void main(String[] args){
	
		//Storing cost price in costPrice variable
		double costPrice = 129;
		
		//Storing selling price in sellingPrice variable
		double sellingPrice = 191;

		//calculating the profit
		double profit = sellingPrice-costPrice;
		
		//calculating the profit percentage
		double profitPercentage = (profit/costPrice)*100;
		
		//Display the result
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR "+sellingPrice);
		System.out.println("The Profit is INR " + profit + " and the Profit Percentage is "+profitPercentage);
	
	}
}