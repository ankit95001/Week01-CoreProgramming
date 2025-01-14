import java.util.Scanner;
//Creating class FibonacciGenerator for Fibonacci
public class FibonacciGenerator {
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        System.out.println("Fibonacci sequence:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
		//Creating object iof Scanner class for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter the number of terms: ");
        int terms = input.nextInt();
		
		//Calling methods
        generateFibonacci(terms);
    }
}
