import java.util.Scanner;
//Creating class UniqueCharacters for checking
public class UniqueCharacters {
    public static int findLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {
        int len = findLength(text);
        char[] unique = new char[len];
        int uniqueIndex = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check if character is unique
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uniqueIndex++] = current;
            }
        }

        // Trim the array
        char[] result = new char[uniqueIndex];
        System.arraycopy(unique, 0, result, 0, uniqueIndex);
        return result;
    }

    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);

        System.out.println("Unique characters:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
		
		//closing the scanner class object
        input.close();
    }
}
