import java.util.Scanner
public class CharArrayComparison {
    // Method to return characters without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking input for the string
        System.out.print("Enter a string: ");
        String text = input.next();

        // Getting characters 
        char[] charsUserDefined = getCharacters(text);
        char[] charsBuiltIn = text.toCharArray();

        // Comparing both arrays
        boolean areEqual = compareCharArrays(charsUserDefined, charsBuiltIn);
        System.out.println("Are both character arrays equal? " + areEqual);
		
		//closing the scanner class object
        input.close(); 
    }
}
