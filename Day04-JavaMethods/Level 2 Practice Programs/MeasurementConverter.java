import java.util.Scanner;
//creating class MeasurementConverter for calculation
public class MeasurementConverter {
	
	//method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
	
	//method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
	
	//method to convert meter to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
	
	//method to convert inches to meter
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
	
	//method to convert inches to centimeter
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        //creating object of scanner class for input
        Scanner input = new Scanner(System.in);
		
		//taking input from user and calling method and printing
        System.out.print("Enter distance in yards: ");
        double yards = input.nextDouble();
        System.out.println("Feet: " + convertYardsToFeet(yards));
		
		//taking input from user and calling method and printing
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
        System.out.println("Yards: " + convertFeetToYards(feet));
		
		//taking input from user and calling method and printing
        System.out.print("Enter distance in meters: ");
        double meters = input.nextDouble();
        System.out.println("Inches: " + convertMetersToInches(meters));
		
		//taking input from user and calling method and printing
        System.out.print("Enter distance in inches: ");
        double inches = input.nextDouble();
        System.out.println("Meters: " + convertInchesToMeters(inches));

        System.out.println("Centimeters: " + convertInchesToCentimeters(inches));
        
		//closing to scanner class object
        input.close()
    }
}
