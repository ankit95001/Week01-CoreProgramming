import java.util.Scanner;
//creating class FindMultiple for multiple finding
public class FindMultiple {
    public static void main(String[] args) {
		//Creating the object of scanner for input
        Scanner input = new Scanner(System.in);
        
		//Taking input
        int number = input.nextInt();
        
        System.out.println("Multiples of " + number + " below 100 are:");
        
        // calculation
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        
        //close the scanner object
        input.close();
    }
}