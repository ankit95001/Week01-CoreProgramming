import java.util.Scanner;
//creating class CalculateForSimpleInterest for simple interest calculation
public class CalculateForSimpleInterest {
	//creating class calculateSimpleInterest for calculation
	public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal*rate*time) / 100;
    }
    public static void main(String[] args) {
		//creating object of scanner class for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();
		
		//Calling the function
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
		
		//Display the result
        System.out.printf("The Simple Interest is "+simpleInterest+" for Principal "+principal+" Rate of Interest "+rate+" and Time "+time);
		
		//clsoe the scanner object 
		input.close();
    }
}
