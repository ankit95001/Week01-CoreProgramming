import java.util.Scanner;
//Creating class CheckNumber for check
public class CheckNumber {
    public static void main(String[] args) {
        //Creating the scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking age as input
        System.out.print("Enter the number : ");

        // Store the input in the number variable
        int number = input.nextInt(); 

        //Check for number
        if(number == 0){
            System.out.println("Zero");
        }else if(number>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }

        input.close();
    }
}