import java.util.Scanner;
//Creating class TwoDOneD for conversion
public class TwoDOneD {
    public static void main(String[] args) {
		// Scanner for user input
        Scanner input = new Scanner(System.in); 

        // Taking input for rows and columns
        System.out.println("Enter the number of rows:");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = input.nextInt();
		
		// 2D array
        int[][] matrix = new int[rows][cols]; 
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Converting 2D array to 1D array
        int[] array = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Displaying the 1D array
        System.out.print("1D Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
		
		// Closing the Scanner object
        input.close(); 
    }
}
