// Create PoundToKilograms Class to converts it into kilograms from pound
import java.util.Scanner;
class PoundToKilograms{
	public static void main(String[] args){
	
		//Storing pound
		double pound;
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		//Use Scanner Object to take user input for pound
		pound=input.nextDouble();
		
		
		//calculate weight in kilograms
		double kilograms = pound*2.2;
		
		//Display the result
		System.out.println("The weight of the person in pound is " + pound + " and in kg is "+kilograms);

		input.close();
		
	}
}
	
