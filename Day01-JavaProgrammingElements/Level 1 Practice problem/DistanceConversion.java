// Create DistanceConversion Class to compute conversion
import java.util.Scanner;
class DistanceConversion{
	public static void main(String[] args){
	
		//Create a variable km
		double km;
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		//Use Scanner Object to take user input for km
		km=input.nextDouble();
		
		//calculate the distance
		
		double distanceInMiles = km/1.6;
		
		//Display the result
		System.out.println("The total miles is " + distanceInMiles + " mile for the given "+km +" km");

		input.close();
		
	}
}
	
