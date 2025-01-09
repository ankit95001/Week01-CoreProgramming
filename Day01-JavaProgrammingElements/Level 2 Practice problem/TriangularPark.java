// Creating class for calculation of total number ofrounds the athelete will run 
import java.util.Scanner;
public class TriangularPark {
    public static void main(String[] args) {
		//Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        //Input for side 1
        double side1 = input.nextDouble();
        
		//Input for side 2
        double side2 = input.nextDouble();
        
		//Input for side 3
        double side3 = input.nextDouble();
		
		//Calculate the perimeter
        double perimeter = side1 + side2 + side3;
        int rounds = (int) (5000 / perimeter);

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}