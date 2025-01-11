//Creating class RandomNumbersGenerator for generating random number
public class RandomNumbersGenerator {
	
	//creating method for generating number
    public static int[] generate4DigitRandomArray(int size) {
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
        numbers[i] = 1000 + (int) (Math.random() * 9000);
		}
		return numbers;
	}

	//creating method for find average
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0, min = numbers[0], max = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new double[]{(double) sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
		//calling method
        int[] numbers = generate4DigitRandomArray(5);
        System.out.print("Generated Numbers: ");
		
		//display result
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
		//Display result
        double[] results = findAverageMinMax(numbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
