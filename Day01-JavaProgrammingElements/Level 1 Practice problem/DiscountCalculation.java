// Create DiscountCalculation Class to find the discounted amount and discounted price
class DiscountCalculation{
	public static void main(String[] args){
	
		//Storing total fee
		int totalFee = 125000;
		
		//Storing discount percentage
		int discountPercentage = 10;
		
		//calculate discounted amount
		int discountedPrice = totalFee-(totalFee/10);
		
		//Display the result
		System.out.println("The discount amount is INR " + totalFee + " and final discounted fee is INR "+discountedPrice);
		
	}
}