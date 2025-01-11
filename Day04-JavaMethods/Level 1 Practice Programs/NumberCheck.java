import java.util.Scanner;
//Creating class NumberCheck for checking the number
public class NumberCheck {
	
	//creating method checkNumber for checking
	static int checkNumber(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
		
		//calling the function for checking
        int result = checkNumber(number);
		
		//comparing the results
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
		
		//closing the scanner object
		input.close();
    }
}