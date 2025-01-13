import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionDemo {
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] array) {
        System.out.println(array[array.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] array) {
        try {
            System.out.println(array[array.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
		//Creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//Taking input
        System.out.print("Enter the number of names: ");
        int n = input.nextInt();
        String[] names = new String[n];
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = input.next();
        }

        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        generateArrayIndexOutOfBoundsException(names);

        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleArrayIndexOutOfBoundsException(names);
		
		//closing scanner class object
        input.close();
    }
}
