import java.util.Scanner;
//Creating class LineAndDistanceCalculator for calculation
public class LineAndDistanceCalculator {

    // Method to find the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance; // Return the computed distance
    }

    // Method to find the slope and y-intercept of a line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1); 
        double yIntercept = y1 - slope * x1; 
        return new double[]{slope, yIntercept}; 
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take inputs for two points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Calculate line equation
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("Slope (m): " + lineEquation[0]);
        System.out.println("Y-Intercept (b): " + lineEquation[1]);

        // Close the scanner class obejct
        input.close();
    }
}
