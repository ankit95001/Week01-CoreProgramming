public class NullPointerDemo {
    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
	
        System.out.println("Generating NullPointerException:");
        generateNullPointerException();

        System.out.println("\nHandling NullPointerException:");
        handleNullPointerException();
    }
}
