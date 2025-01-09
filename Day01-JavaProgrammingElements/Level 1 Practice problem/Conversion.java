// Create Conversion Class to convert the distance of 10.8 kilometers to miles
class Conversion{
	public static void main(String[] args){
	
		//Storing distance in distance variable
		double distance = 10.8;
		
		//Storing value of 1 km in miles in value variable
		double value = 1.6;

		//convert kilometers to miles
		double distnaceInMiles = distance*value;
		
		//Display the result
		System.out.println("Distance in miles are " + distnaceInMiles);
	}
}