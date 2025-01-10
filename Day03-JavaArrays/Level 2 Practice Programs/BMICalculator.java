import java.util.Scanner; // Import Scanner for user inputs
// creating class BMICalculator for calculating BMI
public class BMICalculator {
    public static void main(String[] args) {
		// Creating Scanner object
        Scanner input = new Scanner(System.in); 
		
		// Number of team members
        System.out.println("Enter the number of persons:");
        int numberOfPersons = input.nextInt(); 

        // Arrays to store weight, height, BMI, and status
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];

        // Taking input for weight and height
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter weight for person " + (i + 1) + ":");
            weights[i] = input.nextDouble();
            if (weights[i] <= 0) {
                System.out.println("Please enter a positive value.");
                i--; 
                continue;
            }

            System.out.println("Enter height for person " + (i + 1) + ":");
            heights[i] = input.nextDouble();
            if (heights[i] <= 0) {
                System.out.println("Please enter a positive value.");
                i--;
            }
        }

        // Calculating BMI and determining status
        for (int i = 0; i < numberOfPersons; i++) {
			// BMI formula
            bmi[i] = weights[i] / (heights[i] * heights[i]); 

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Displaying the results
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("height is : "+ heights[i]+" weight is "+ weights[i]+" BMI is "+bmi[i]+" status is "+ status[i]);
        }
		// Closing the Scanner object
        scanner.close(); 
    }
}
