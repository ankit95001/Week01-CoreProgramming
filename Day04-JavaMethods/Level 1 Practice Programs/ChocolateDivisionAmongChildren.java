import java.util.Scanner;
// 	creating class ChocolateDivisionAmongChildren for division
public class ChocolateDivisionAmongChildren {

	//creating the method findRemainderAndQuotient for division
	public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
	
		//creating object of Scanner class for input
        Scanner input = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter number of chocolates: ");
        int chocolates = input.nextInt();
		
        System.out.print("Enter number of children: ");
        int children = input.nextInt();
		
		//calling the function for calculation
        int[] result = findRemainderAndQuotient(chocolates, children);
		
		//Displying the result
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
		
		//Closing the scanner object
		input.close();
    }
}