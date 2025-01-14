import java.util.Scanner;
//Creating class MaximumOfThree for calculation
public class MaximumOfThree {
	public static int findMax(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }
    public static void main(String[] args) {
		//Creating scanner object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        int max = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
    }
}
