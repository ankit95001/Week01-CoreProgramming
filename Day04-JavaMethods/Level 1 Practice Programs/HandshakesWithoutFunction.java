import java.util.Scanner;
//creating class HandshakesWithoutFunction for calculation of handshake
public class HandshakesWithoutFunction {
    public static void main(String[] args) {
        //creating object of scanner class for input
        Scanner input = new Scanner(System.in);
		
		//Taking input for number of students
        System.out.print("Enter number of students: ");
        int totalStudents = input.nextInt();
		
		//calculating the total handshakes
        int handshakes = (totalStudents * (totalStudents - 1)) / 2);
		
		//Displaying the results
        System.out.println("The maximum number of handshakes is: " + handshakes);
		
		//closing the scanner object
		input.close();
    }
}
