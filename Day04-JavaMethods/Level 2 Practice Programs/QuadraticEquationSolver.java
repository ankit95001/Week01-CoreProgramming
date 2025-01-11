import java.util.Scanner;
//Creating class QuadraticEquationSolver for solution
public class QuadraticEquationSolver {
	
	//Creating method for root finding
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) return new double[0];
        if (delta == 0) return new double[]{-b / (2 * a)};
        return new double[]{(-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a)};
    }

    public static void main(String[] args) {
		
		//Creating Scanner class obejct for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
		
		//calling methods and printing result
        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else {
            for (int i = 0; i < roots.length; i++) {
                System.out.println("Root " + (i + 1) + ": " + roots[i]);
            }
        }
		
		//closing the scanner object
        input.close();
    }
}
