import  java.util.Scanner;
//Creating class FrequencyUsingUnique for finding
public class FrequencyUsingUnique {
    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {
        int len = text.length();
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

        char[] result = new char[uniqueIndex];
        System.arraycopy(unique, 0, result, 0, uniqueIndex);
        return result;
    }

    // Method to find frequency of unique characters
    public static String[][] findFrequencyUsingUnique(String text) {
        char[] unique = findUniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            char current = unique[i];
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == current) {
                    count++;
                }
            }

            result[i][0] = String.valueOf(current);
            result[i][1] = String.valueOf(count);
        }

        return result;
    }

    public static void main(String[] args) {
		//Creating Scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a string: ");
        String text = input.nextLine();
		
		//Calling function
        String[][] result = findFrequencyUsingUnique(text);

        System.out.println("Character\tFrequency");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
		
		//CLosing the Scanner class object
        input.close();
    }
}
