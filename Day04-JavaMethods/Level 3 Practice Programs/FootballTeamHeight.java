import java.util.Scanner;
//Creating class FootballTeamHeight for calculation
public class FootballTeamHeight {
    // Method to calculate the sum of heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int sum, int count) {
        return (double) sum / count;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Array to store heights of 11 players
        int[] heights = new int[11];
        Scanner input = new Scanner(System.in); // Create Scanner object for input

        // Taking input for player heights
        System.out.println("Enter the heights (in cms) of 11 players (between 150 to 250):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextInt(); 
        }

        // Calculate sum, mean, shortest, and tallest
        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display the results
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
		
		 // Close the Scanner
        input.close();
    }
}
