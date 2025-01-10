import java.util.Scanner;
// Creating PrimeCheck class to check number is prime or not
public class PrimeCheck {
    public static void main(String[] args) {
		//Creating scanner object for the input
        Scanner input = new Scanner(System.in);
        
        // Input the number from the user
        System.out.print("Enter a number- ");
        int number = input.nextInt();
        
        boolean isPrime = true;

        // Check if the number is greater than 1
        if (num > 1) {
            // Loop 
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Number is divisible by i
                    break;
                }
            }
        } else {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        }

        // Output the result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        input.close();
    }
}
