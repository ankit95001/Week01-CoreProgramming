import java.util.Scanner;
//Creating class IllegalArgumentExceptionDemo for Demo
public class IllegalArgumentExceptionDemo {
    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String text) {
        System.out.println(text.substring(5, 3));
    }

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentException(String text) {
        try {
            System.out.println(text.substring(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.println("\nGenerating IllegalArgumentException:");
        generateIllegalArgumentException(text);

        System.out.println("\nHandling IllegalArgumentException:");
        handleIllegalArgumentException(text);
		
		//closing the scanner class object
        input.close();
    }
}
