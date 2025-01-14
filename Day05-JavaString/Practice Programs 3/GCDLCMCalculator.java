import java.util.Scanner;
Creating class GCDLCMCalculator for calculation
public class GCDLCMCalculator {
	public static int calculateGCD(int a, int b) {
        if (b == 0) return a;
        return calculateGCD(b, a % b);
    }
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
		
		// calling method
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
		
		//Printing result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
