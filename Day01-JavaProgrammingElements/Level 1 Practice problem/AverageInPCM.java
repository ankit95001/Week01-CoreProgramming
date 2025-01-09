// Create AverageInPCM Class to compute the average percent mark in PCM
class AverageInPCM{
	public static void main(String[] args){
		
		//Storing age of Sam’s mark in Maths in mathsMarkes variable
		int mathsMarkes = 94;
		
		//Storing age of Sam’s mark in Physics in physicsMarkes variable
		int physicsMarkes = 95;
		
		//Storing age of Sam’s mark in Chemistry in chemistryMarkes variable
		int chemistryMarkes = 96;
		
		//Calculating the average of PCM
		int averageMarks = (mathsMarkes+chemistryMarkes+physicsMarkes)/3;
		
		//Display the average percent mark in PCM
		System.out.println("Average percent mark in PCM is " + averageMarks);
	}
}
	
