import java.util.Scanner;
//Creating class ShortestLongestWords for checking
public class ShortestLongestWords {
    public static String[] splitText(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        return words;
    }

    public static String[] findShortestLongest(String[] words) {
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
		
		//Creating Scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        String[] words = splitText(text);
        String[] result = findShortestLongest(words);
		
		//Printing result
        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
		
		//CLosing Scanner class object
        input.close();
    }
}
