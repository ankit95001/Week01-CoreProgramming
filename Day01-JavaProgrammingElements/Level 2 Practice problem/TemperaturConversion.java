import java.util.Scanner;
public class TemperaturConversion {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
		
        // Declare variables celsius of double data type
        double celsius;

        // taking value of celsius from user
        celsius=input.nextDouble();

        // Perform the operations convert
		double farenheitResult = (celsius*9/5)+32;

        // Print the results
        System.out.println("The "+celsius+" celsius is "+farenheitResult+" fahrenheit.");
        input.close();
    }
}
