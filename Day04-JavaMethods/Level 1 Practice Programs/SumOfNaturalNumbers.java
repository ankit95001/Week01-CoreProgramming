import java.util.Scanner;
//Creating class SumOfNaturalNumbers for calculating the sum
public class SumOfNaturalNumbers {
	//craeting method for calculation
	public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		//calling the function for calculation
        int sum = calculateSum(number);
		
		//Displying the result
        System.out.println("The sum of " + number + " natural numbers is: " + sum);
		
		//close the scanner object
		input.close();
    }
}
