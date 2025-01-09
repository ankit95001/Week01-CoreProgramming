// Create PenDistribution Class to calculate pens each student will get
class PenDistribution{
	public static void main(String[] args){
	
		//Storing total pens
		int totalPens = 14;
		
		//Storing number of studednts
		int totalStudents = 3;
		
		//calculate pens each student will get
		int penEachStudentGet = totalPens/totalStudents;
		
		//calculate non-distributed pens
		int remaningPen = totalPens%totalStudents;
		
		//Display the result
		System.out.println("The Pen Per Student is " + penEachStudentGet + " and the remaining pen not distributed is "+remaningPen);
		
	}
}