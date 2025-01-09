// Create DistanceinYardsAndMiles Class to calculate
import java.util.Scanner;
class DistanceinYardsAndMiles{

	public static void main(String[] args){
	
		//Storing total fee and discount percentage
		float distanceInFeet;
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		//Use Scanner Object to take user input for base
		distanceInFeet=input.nextFloat();
		
		//calculating distance in yard
		double distanceInYard = distanceInFeet/3;
		
		//calculating distance in miles
		double distanceInMiles = distanceInYard/1760;
		
		//Display the result
		System.out.println("Distance in yards are "+distanceInYard+" and miles "+distanceInMiles);
		input.close();
	}
}