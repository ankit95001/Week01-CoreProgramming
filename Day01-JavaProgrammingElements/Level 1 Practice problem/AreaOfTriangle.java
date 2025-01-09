// Create AreaOfTriangle Class to calculate
import java.util.Scanner;
class AreaOfTriangle{

	public static void main(String[] args){
	
		//Storing total fee and discount percentage
		float base,height;
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		//Use Scanner Object to take user input for base
		base=input.nextFloat();
		
		//Use Scanner Object to take user input for height
		height=input.nextFloat();
		
		//calculating base in inches
		double baseInInches = (base/2.54);
		
		//calculating height in inches
		double heightInInches = (height/2.54);
		
		//calculating each operation
		float areaInInches = 0.5*baseInInches*heightInInches;
		
		float areaInCentimeter = 0.5*base*height;
		

		//Display the result
		System.out.println("Area of triangle in centimeter is "+areaInCentimeter+" and in inches are "+areaInInches);
		input.close();
	}
}