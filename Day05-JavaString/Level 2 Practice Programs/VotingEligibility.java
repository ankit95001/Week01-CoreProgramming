import java.util.Random;
import java.util.Scanner;
//Creating Class VotingEligibility for checking
public class VotingEligibility {
    public static int[] generateAges(int numStudents) {
        Random random = new Random();
        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            ages[i] = random.nextInt(50);
        }
        return ages;
    }

    // Method to determine voting eligibility
    public static String[][] votingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display results in a tabular format
    public static void displayTable(String[][] table) {
        System.out.println("Age\tStatus");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
		//Creating Scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[] ages = generateAges(numStudents);
        String[][] results = votingEligibility(ages);
		
		//Display result
        displayTable(results);
		
		//Closing Scanner class object
        input.close();
    }
}
