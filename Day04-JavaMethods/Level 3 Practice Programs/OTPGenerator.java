import java.util.HashSet;
//Creating class OTPGenerator for OTP generation
public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    // Method to check if OTPs are unique
	public static boolean areOTPsUnique(int[] otps) {
		for (int i = 0; i < otps.length; i++) {
			for (int j = i + 1; j < otps.length; j++) {
				if (otps[i] == otps[j]) {
					return false; // If a duplicate is found
				}
			}
		}
		// No duplicates found
		return true; 
	}
	
    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Validate uniqueness
        System.out.println("Are OTPs Unique: " + areOTPsUnique(otps));
    }
}
