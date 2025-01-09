// Create CalculateTotalPrice Class to calculate
import java.util.Scanner;
class CalculateTotalPrice{

	public static void main(String[] args){
	
		//storing quantity and unitPrice
		int quantity,unitPrice;
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		//Use Scanner Object to take user input for unitPrice
		unitPrice=input.nextInt();
		
		//Use Scanner Object to take user input for quantity
		quantity=input.nextInt();
		
		//calculating total price
		int totalPrice = unitPrice*quantity;
		

		//Display the result
		System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
		input.close();
	}
}