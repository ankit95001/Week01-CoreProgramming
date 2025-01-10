import java.util.Scanner; // Import Scanner for user inputs
// Creating class for BMI Calculator for 2D
public class BMICalculatorMultiD {
    public static void main(String[] args) {
		// Creating Scanner object
        Scanner scanner = new Scanner(System.in); 
		
		// Number of team members
        System.out.println("Enter the number of persons:");
        int personCount = scanner.nextInt(); 

        // 2D array to store weight, height, and BMI
        double[][] dataOfPerson = new double[personCount][3];
        String[] weightStatus = new String[personCount];

        // Taking input for weight and height
        for (int i = 0; i < personCount; i++) {
            System.out.println("Enter weight for person " + (i + 1) + ":");
            dataOfPerson[i][0] = scanner.nextDouble();
            if (dataOfPerson[i][0] <= 0){
                System.out.println("Please enter a positive value.");
                i--;
                continue;
            }

            System.out.println("Enter height for person " + (i + 1) + ":");
            dataOfPerson[i][1] = scanner.nextDouble();
            if (dataOfPerson[i][1] <= 0) {
                System.out.println("Please enter a positive value.");
                i--;
            }
        }

        // Calculating BMI and determining status
        for (int i = 0; i < personCount; i++) {
            dataOfPerson[i][2] = dataOfPerson[i][0] / (dataOfPerson[i][1] * dataOfPerson[i][1]);

            if (dataOfPerson[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (dataOfPerson[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (dataOfPerson[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying the results
        for (int i = 0; i < personCount; i++) {
            System.out.printf("Data of person + i+1 +" is "+dataOfPerson[i][1]+" "+ dataOfPerson[i][0]+" "+ dataOfPerson[i][2]+" "+ weightStatus[i]);
        }
		
		// Closing the Scanner object
        scanner.close(); 
    }
}
