// Create MaximumNumberOfHandshakes Class to calculate the handshake
import java.util.Scanner;
class MaximumNumberOfHandshakes{

	public static void main(String[] args){
	
		//Storing total number of student
		int numberOfStudents;
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		//Use Scanner Object to take user input for number of student
		numberOfStudents=input.nextInt();
		
		//calculating each operation
		int combination = (numberOfStudents*(numberOfStudents-1))/2;

		//Display the result
		System.out.println("The number of possible handshakes are "+combination);
		input.close();
	}
}