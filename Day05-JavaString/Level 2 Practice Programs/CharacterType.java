import java.util.Scanner;
//Creating class CharacterType for checking
public class CharacterType {
    public static String checkCharacterType(char c) {
        if (Character.isLetter(c)) {
            char lowerC = Character.toLowerCase(c);
            if ("aeiou".indexOf(lowerC) >= 0) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] characterAnalysis(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharacterType(c);
        }
        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] table) {
        System.out.println("Character\tType");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
		//Creating Scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String[][] result = characterAnalysis(text);
        displayTable(result);
		
		//closing scanner class object
        input.close();
    }
}
