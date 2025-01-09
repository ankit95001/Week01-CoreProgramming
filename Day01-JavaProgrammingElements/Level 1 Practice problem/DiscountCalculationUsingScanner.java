// Create DiscountCalculationUsingScanner Class to find the discounted amount and discounted price
import java.util.Scanner;
class DiscountCalculationUsingScanner{
	public static void main(String[] args){
	
		//Storing total fee and discount percentage
		int totalFee,discountPercentage;
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		//Use Scanner Object to take user input for totalFee
		totalFee=input.nextInt();
		
		//Use Scanner Object to take user input for discountPercentage
		discountPercentage=input.nextInt();
		
		//calculate discounted amount
		int discountedPrice = totalFee-(totalFee/discountPercentage);
		
		//Display the result
		System.out.println("The discount amount is INR " + totalFee + " and final discounted fee is INR "+discountedPrice);
		
		input.close();
	}
}
	
