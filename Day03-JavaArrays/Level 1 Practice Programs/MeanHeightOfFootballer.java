import java.util.Scanner;
//Creating class MeanHeight for calculation
public class MeanHeightOfFootballer {
    public static void main(String[] args) {
		// Scanner for user input
        Scanner input = new Scanner(System.in); 
		
		// Array to store player heights
        double[] heights = new double[11]; 
        double sum = 0; 

        // Taking input for player heights
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculating the mean height
        double mean = sum / heights.length;
		
        System.out.println("The mean height of the football team is: " + mean);
		
		// Closing the Scanner object
        input.close(); 
    }
}
