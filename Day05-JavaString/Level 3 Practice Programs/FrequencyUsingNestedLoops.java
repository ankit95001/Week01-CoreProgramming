import java.util.Scanner;
//Creating class FrequencyUsingNestedLoops for finding
public class FrequencyUsingNestedLoops {
    // Method to find character frequency using nested loops
    public static String[][] findCharacterFrequency(String text) {
        int len = text.length();
        char[] characters = text.toCharArray();
        int[] frequency = new int[len];
        boolean[] visited = new boolean[len];

        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                frequency[i] = 1;
                for (int j = i + 1; j < len; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++;
                        visited[j] = true;
                    }
                }
            }
        }

        int uniqueCount = 0;
        for (boolean visit : visited) {
            if (!visit) uniqueCount++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                result[index][0] = String.valueOf(characters[i]);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
		//Creating SCanner class obejct for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a string: ");
        String text = input.nextLine();
		
		//calling methods
        String[][] result = findCharacterFrequency(text);

        System.out.println("Character\tFrequency");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
		
		//CLosing Scanner class obejct
        input.close();
    }
}
