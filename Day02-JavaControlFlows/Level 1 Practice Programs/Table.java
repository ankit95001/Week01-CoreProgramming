import java.util.Scanner;
//creating class table 
class Table{
    public static void main(String[] args) {
        //Creating the scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking as input
        System.out.print("Enter a number - ");
        int number = input.nextInt();

        // Generating multiplication table
 
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        //closing the scanner object
        input.close();
    }
}