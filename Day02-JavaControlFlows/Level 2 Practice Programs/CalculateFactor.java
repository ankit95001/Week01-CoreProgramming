import java.util.Scanner;
//Creating the class CalculateFactor for finding the factor
public class CalculateFactor {
    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);
        
        // Get the input value
        int number = input.nextInt();
        
        System.out.println("Factors of " + number + " is :");
        
        // calculation
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        
        //close the scanner object
        input.close();
    }
}