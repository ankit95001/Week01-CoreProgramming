import java.util.Scanner;
//creating class Handshakes for calculation of handshake
public class Handshakes {
	
	//Creating method for handshake calculation
	static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
	
		//creating object of scanner class for input
        Scanner input = new Scanner(System.in);
		
		//Taking input for number of students
        System.out.print("Enter number of students: ");
        int totalStudents = input.nextInt();
		
		//calling the function for calculation
        int handshakes = calculateHandshakes(totalStudents);
		
		//Displaying the result
        System.out.println("The maximum number of handshakes is: " + handshakes);
		
		//Close the scanner object
		input.close();
    }
}
