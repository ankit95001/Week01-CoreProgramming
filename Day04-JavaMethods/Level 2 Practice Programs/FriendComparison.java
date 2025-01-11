import java.util.Scanner;
//Creating class for FriendComparison for comparsion
public class FriendComparison {
	
	//creating method to find youngest 
    public static int findYoungest(int[] ages) {
        int youngest = ages[0];
        for (int age : ages) {
            if (age < youngest) youngest = age;
        }
        return youngest;
    }
	
	//creating method for finding tallest
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) tallest = height;
        }
        return tallest;
    }

    public static void main(String[] args) {
		
		//Creating Scanner object for input
        Scanner input = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
	
		//Taking input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + " in cm: ");
            heights[i] = input.nextInt();
        }
		
		//Display result
        System.out.println("Youngest friend's age: " + findYoungest(ages));
        System.out.println("Tallest friend's height: " + findTallest(heights) + " cm");
		
		//closing the scanner object
        input.close();
    }
}
