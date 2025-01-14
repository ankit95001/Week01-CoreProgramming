import java.util.Scanner;
//Creating class StringLength for Calculation
public class StringLength {
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            return length;
        }
    }

    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a string: ");
        String text = input.nextLine();
		
		//Calling and displaying result
        int calculatedLength = findLength(text);
        System.out.println("Calculated Length: " + calculatedLength);
        System.out.println("Built-in Length: " + text.length());
		
		//Closing the Scanner object
        input.close();
    }
}
