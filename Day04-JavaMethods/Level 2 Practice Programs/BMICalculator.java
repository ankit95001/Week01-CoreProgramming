import java.util.Scanner;
//Creating class BMICalculator for calculating BMI
public class BMICalculator {
	
	//Method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightMeters * heightMeters);
        }
    }
	
	//Method to get status of BMI
    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obesity";
    }

    public static void main(String[] args) {
	
		//Creating Scanner object for input
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3];
		
		//Taking input
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = input.nextDouble();
        }
		
		//Calling method for BMI
        calculateBMI(data);
		
		//Display the result
        for (int i = 0; i < data.length; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + data[i][1] + " cm, Weight = " + data[i][0] + " kg, BMI = " + data[i][2] + ", Status = " + getStatus(data[i][2]));
        }
		
		//clsoing the scanner object
        input.close();
    }
}
