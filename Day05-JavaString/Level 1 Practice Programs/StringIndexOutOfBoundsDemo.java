import java.util.Scanner;
public class StringIndexOutOfBoundsDemo {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length() + 1)); 
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking input for the string
        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        generateException(text);

        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(text);
		
		//Closing scanner class object
        input.close();
    }
}
