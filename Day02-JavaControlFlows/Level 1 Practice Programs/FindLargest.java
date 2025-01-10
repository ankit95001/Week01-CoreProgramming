import java.util.Scanner;
//creating FindLargest class for the check
class FindLargest{
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

        // Initialize results
        boolean firstLargest = false;
        boolean secondLargest = false;
        boolean thirdLargest = false;

        // Determine largest number
        if(number1 > number2 && number1 > number3){
            firstLargest = true;
        }else if(number2 > number1 && number2 > number3){
            secondLargest = true;
        }else if(number3 > number1 && number3 > number2){
            thirdLargest = true;
        }

        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

        // Close the scanner
        input.close();
    }
}