// Creating class for conversion from Fahrenheit to Celsius 
import java.util.Scanner; 
public class TemperatureConversionFtoC {
    public static void main(String[] args) {
		//Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        //Input for fahrenheit
        double fahrenheit = input.nextDouble();
		
		//calculating the celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
    }
}