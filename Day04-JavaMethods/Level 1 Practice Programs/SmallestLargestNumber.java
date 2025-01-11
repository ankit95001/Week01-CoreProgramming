import java.util.Scanner;
//Creating class SmallestLargestNumber class for calculation
public class SmallestLargestNumber {
	
	//Creting method findSmallestAndLargest for the finding
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
		
		//use max and min method 
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }
    public static void main(String[] args) {
		//creating the object for scanner class
        Scanner input = new Scanner(System.in);
	
		//Taking input for college
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();
		
		//Calling method for calculation
        int[] result = findSmallestAndLargest(number1, number2, number3);
		
		//Displying the result
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
		
		//closing the scanner objcet
		input.close();
    }
}
