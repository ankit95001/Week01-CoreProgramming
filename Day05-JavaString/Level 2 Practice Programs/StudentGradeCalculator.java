import java.util.Random;
import java.util.Scanner;
//creating class StudentGradeCalculator for calculation
public class StudentGradeCalculator {

    // Method to generate random scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(101); // Physics score
            scores[i][1] = random.nextInt(101); // Chemistry score
            scores[i][2] = random.nextInt(101); // Maths score
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStatistics(int[][] scores) {
        double[][] statistics = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            statistics[i][0] = total;
            statistics[i][1] = Math.round(average * 100.0) / 100.0; 
            statistics[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return statistics;
    }

    // Method to calculate grades
    public static String[] calculateGrades(double[][] statistics) {
        String[] grades = new String[statistics.length];
        for (int i = 0; i < statistics.length; i++) {
            double percentage = statistics[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] statistics, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\t\t%s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    statistics[i][0], statistics[i][1], statistics[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Generate random scores
        int[][] scores = generateScores(numStudents);

        // Calculate statistics
        double[][] statistics = calculateStatistics(scores);

        // Calculate grades
        String[] grades = calculateGrades(statistics);

        // Display scorecard
        displayScorecard(scores, statistics, grades);
		
		//Closing Scanner class object
        input.close();
    }
}
