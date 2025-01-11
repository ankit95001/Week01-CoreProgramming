import java.util.Scanner;
//Creating class StudentVoteChecker for checking
public class StudentVoteChecker {
	
	//creating method for checking
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18;
    }

    public static void main(String[] args) {
		
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];
		
		//Taking input and checking
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            if (canStudentVote(ages[i])) {
                System.out.println("Student can vote.");
            } else {
                System.out.println("Student cannot vote.");
            }
        }
		
		//closing the scanner obejct
        input.close();
    }
}
