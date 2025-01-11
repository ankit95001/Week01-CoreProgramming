import java.util.Scanner;
//Creating class TrigonometricFunctions for calculation
public class TrigonometricFunctions {

	//creating function calculateTrigonometricFunctions for calculation
	public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
    public static void main(String[] args) {
	
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input form user
        System.out.print("Enter an angle : ");
        double angle = input.nextDouble();
		
		//calling method for calculation
        double[] results = calculateTrigonometricFunctions(angle);
		
		//Display the result
        System.out.println("Sine: " +results[0]+" Cosine: "+ results[1]+" Tangent: "+ results[2]);
		
		//closing the scanner object
		input.close();
    }
}
