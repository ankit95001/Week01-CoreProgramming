import java.util.Scanner;
//Creating class Grade for grade calculation
public class Grade {
    public static void main(String[] args) {
		//Creating scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking as input Marks of physics Chemistry and Maths
        System.out.print("Enter marks for Physics- ");
        int physics = input.nextInt();
        System.out.print("Enter marks for Chemistry- ");
        int chemistry = input.nextInt();
        System.out.print("Enter marks for Maths- ");
        int maths = input.nextInt();
	
	//Calculate the total marks
        int totalMarks = physics+chemistry+maths;
        double percentage = (totalMarks / 3.0);

        char grade;
        String remarks;
	// checking the grade
        if (percentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        System.out.println();
        System.out.println("Average Marks: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
		//close the scanner object
        input.close();
    }
}