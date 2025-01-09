// Create VolumeCalculation Class to compute the volume of Earth
class VolumeCalculation{
	public static void main(String[] args){
	
		//Storing radius of earth
		double radius = 6378;
		double radiusInMiles = radius*0.62137;
		
		double pi = 3.14;
		
		//calculating the volume of Earth in Cubic km
		double volumeOfEarthInCubicKm = (4/3)*pi*radius*radius*radius;
		
		//calculating the volume of Earth in Cubic miles
		double volumeOfEarthInCubicMiles = (4/3)*pi*radiusInMiles*radiusInMiles*radiusInMiles;
		
		
		//Display the result
		System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthInCubicKm + " and cubic miles is "+volumeOfEarthInCubicMiles);
		
	}
}
	
