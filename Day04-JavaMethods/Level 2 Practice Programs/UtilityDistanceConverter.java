import java.util.Scanner;
//creating class UtilityDistanceConverter for calculation
public class UtilityDistanceConverter {
	
	//method to convert km to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
	
	//methods to convert miles to km
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

	//methods to convert meter to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
		
	//methods to convert feet to meter
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
	
		//creating object of scanner class for input
        Scanner input = new Scanner(System.in);
		
		//Taking input and calling methods
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        System.out.println("Miles: " + convertKmToMiles(km));
		
		//Taking input and calling methods
        System.out.print("Enter distance in miles: ");
        double miles = sc.nextDouble();
        System.out.println("Kilometers: " + convertMilesToKm(miles));

		//Taking input and calling methods
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        System.out.println("Feet: " + convertMetersToFeet(meters));
		
		//Taking input and calling methods
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        System.out.println("Meters: " + convertFeetToMeters(feet));
		
		//closing to scanner class object
        input.close();
    }
}
