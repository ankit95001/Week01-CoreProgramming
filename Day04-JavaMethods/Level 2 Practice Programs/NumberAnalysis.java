import java.util.Scanner;
//Creating class NumberAnalysis for checking
public class NumberAnalysis {
	
	//Method for checking positive
    public static boolean isPositive(int num) {
        return num > 0;
    }
	
	//Method for checking Even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
	
	//Method for compare
    public static int compare(int num1, int num2) {
        return Integer.compare(num1, num2);
    }
	
    public static void main(String[] args) {
	
		//creating scanner obejct for input
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
		
		//Taking input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            if (isPositive(numbers[i])) {
                System.out.println("Positive " + (isEven(numbers[i]) ? "Even" : "Odd"));
            } else {
                System.out.println("Negative");
            }
        }
		
		//Display result
        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparison > 0) {
            System.out.println("First number is greater than the last.");
        } else if (comparison < 0) {
            System.out.println("First number is less than the last.");
        } else {
            System.out.println("First and last numbers are equal.");
        }
		
		//closing the scanner obejct
        input.close();
    }
}
