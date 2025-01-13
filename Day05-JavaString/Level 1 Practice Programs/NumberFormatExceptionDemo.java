import java.util.Scanner;
public class NumberFormatExceptionDemo {
    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        System.out.println(Integer.parseInt(text));
    }

    // Method to handle NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.println("\nGenerating NumberFormatException:");
        generateNumberFormatException(text);

        System.out.println("\nHandling NumberFormatException:");
        handleNumberFormatException(text);
		
		//Closing scanner class object
        input.close();
    }
}
