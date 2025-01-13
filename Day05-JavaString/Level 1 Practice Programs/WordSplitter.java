import java.util.Scanner;
//Creating class WordSplitter for splitting
public class WordSplitter {
    // Method to split text into words using charAt()
    public static String[] splitIntoWords(String text) {
        String[] words = text.split(" ");
        return words;
    }

    // Method to find the length of a word without using length()
    public static int findLength(String word) {
        int length = 0;
        for (char c : word.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] wordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        // Splitting text and calculating lengths
        String[] words = splitIntoWords(text);
        String[][] result = wordsAndLengths(words);

        // Displaying results
        System.out.println("Word\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
		
		//closing input class object
        input.close();
    }
}
