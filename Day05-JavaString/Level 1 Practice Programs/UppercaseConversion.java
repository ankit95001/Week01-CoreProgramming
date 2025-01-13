import java.util.Scanner;
public class UppercaseConversion {
    // Method to convert text to uppercase using charAt()
    public static String toUppercaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Custom uppercase conversion
        String customUppercase = toUppercaseCustom(text);

        // Built-in method
        String builtInUppercase = text.toUpperCase();

        // Comparing results
        boolean areEqual = customUppercase.equals(builtInUppercase);
        System.out.println("Custom Uppercase: " + customUppercase);
        System.out.println("Built-In Uppercase: " + builtInUppercase);
        System.out.println("Are both equal? " + areEqual);
		
		//Closing scanner class object
        input.close();
    }
}
