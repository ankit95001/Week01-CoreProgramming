import java.util.Scanner;
//creating FirstSmallestOfThree class for the check
public class FirstSmallestOfThree{
    public static void main(String[] args) {
        //Creating the scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking as input three numbers
        System.out.print("Enter the first number- ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number- ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number- ");
        int number3 = input.nextInt();
		
		boolean firstSmallest;

        // Check if the first number is the smallest
        if(number1 < number2 && number1 < number3){
            firstSmallest = true;
        }else{
            firstSmallest = false;
        }

        //Printing the result
		System.out.println("Is the first number the smallest? " + firstSmallest);
        input.close();
    }
}