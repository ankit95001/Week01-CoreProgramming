import java.util.Scanner;
//Creating class WindChillCalculator for calculation
public class WindChillCalculator {
	
	//creating function calculateWindChill for calculation
	public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
	
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = input.nextDouble();

        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = input.nextDouble();
		
		// calling the method for calculation
        double windChill = calculateWindChill(temperature, windSpeed);
		
		//displaying the result
        System.out.println("The wind chill temperature is: "+ windChill);
    }
}