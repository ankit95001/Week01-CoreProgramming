import java.util.Scanner;
//Creating class TriangularPark for calculation
public class TriangularPark {
	
	//creating method for calculation
	public static int calculateRounds(double perimeter, double distance) {
        return (int) Math.ceil(distance / perimeter);
    }
    public static void main(String[] args) {
	
		//Craeting object of scanner class for input
        Scanner input = new Scanner(System.in);
	
		// 	Taking input from user for side 1
        System.out.print("Enter side 1 : ");
        double side1 = scanner.nextDouble();
		
		// 	Taking input from user for side 
        System.out.print("Enter side 2 : ");
        double side2 = scanner.nextDouble();

		// 	Taking input from user for side 3
        System.out.print("Enter side 3 : ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;
		
		//calculation and calling the function
        int rounds = calculateRounds(perimeter, 5000);
		
		//displaying the result
        System.out.println("The athlete needs to complete " + rounds + " rounds.");
		
		//close the scanner object
		input.close();
    }
}