// Create HeightTOFeetAndInches Class to converts it into feet and inches
import java.util.Scanner;
class HeightTOFeetAndInches{
	public static void main(String[] args){
	
		//Storing height
		double height;
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		//Use Scanner Object to take user input for totalFee
		height=input.nextDouble();
		
		//calculating height in inches
		double heightInInches = (height/2.54);
		//calculate height in feet
		double heightInFeet = (heightInInches/12);
		
		//Display the result
		System.out.println("Your Height in cm is " + height + " while in feet is "+heightInFeet+ " and inches is "+heightInInches);

		input.close();
		
	}
}
	
