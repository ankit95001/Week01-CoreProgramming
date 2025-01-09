// Create CalculateSideOfSquare Class to calculate the side of square
import java.util.Scanner;
class CalculateSideOfSquare{

	public static void main(String[] args){
	
		//Storing total fee and discount percentage
		float perimeter;
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		//Use Scanner Object to take user input for perimeter
		perimeter=input.nextFloat();
		
		//calculating each operation
		float side = perimeter/4;

		//Display the result
		System.out.println("The length of the side is "+ side + " whose perimeter is "+perimeter);
		input.close();
	}
}