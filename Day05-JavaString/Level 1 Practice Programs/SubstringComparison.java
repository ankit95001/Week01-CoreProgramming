import java.util.Scanner
public class SubstringComparison {
    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking input for the string and indices
        System.out.print("Enter a string: ");
        String text = input.next();
		
        System.out.print("Enter start index: ");
        int start = input.nextInt();
		
        System.out.print("Enter end index: ");
        int end = input.nextInt();

        // Creating substrings using charAt() and substring()
        String substringCharAt = createSubstring(text, start, end);
        String substringBuiltIn = text.substring(start, end);

        // Comparing the two substrings
        boolean areEqual = substringCharAt.equals(substringBuiltIn);
        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using substring(): " + substringBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);
		
		//closing scanner class object
        input.close();
    }
}
