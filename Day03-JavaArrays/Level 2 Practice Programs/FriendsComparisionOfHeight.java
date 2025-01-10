import java.util.Scanner;
//creating class FriendsComparisionOfHeight for comparision
public class FriendsComparisionOfHeight {
    public static void main(String[] args) {
		//Creating object of Scanner class for input
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking inputs for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age and height of " + names[i] + ":");
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        // Finding the youngest and tallest
        int youngest = 0;
        int tallest = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngest]) {
                youngest = i;
            }
            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }

        // Displaying results
        System.out.println("Youngest friend: " + names[youngest]);
        System.out.println("Tallest friend: " + names[tallest]);
		
		//close the scanner obejct	
        input.close();
    }
}
