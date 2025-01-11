import java.util.Scanner;
//creating class TemperatureAndVolumeConverter for calculation
public class TemperatureAndVolumeConverter {

	//method to convert fahrenheit to celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
	
	//method to convert celsius to fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
	
	//method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
	
	//method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
	
	//method to convert gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
	
	//method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
	
        //creating object of scanner class for input
        Scanner input = new Scanner(System.in);
		
		//Taking input and calling methods
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println("Celsius: " + convertFahrenheitToCelsius(fahrenheit));
		
		//Taking input and calling methods
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
		
		//Taking input and calling methods
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Kilograms: " + convertPoundsToKilograms(pounds));
		
		//Taking input and calling methods
        System.out.print("Enter weight in kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println("Pounds: " + convertKilogramsToPounds(kilograms));
		
		//Taking input and calling methods
        System.out.print("Enter volume in gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("Liters: " + convertGallonsToLiters(gallons));
		
		//Taking input and calling methods
        System.out.print("Enter volume in liters: ");
        double liters = sc.nextDouble();
        System.out.println("Gallons: " + convertLitersToGallons(liters));

        //closing to scanner class object
        input.close();
    }
}
