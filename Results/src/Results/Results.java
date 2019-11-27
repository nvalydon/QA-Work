package Results;

public class Results {

	static int physResults = 89;
	static int chemResults = 100;
	static int bioResults = 89;
	static int totalMark;
	static float percentage;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		totalMark = results(physResults, chemResults, bioResults);
		percentage  = percent(totalMark);
		
		boolean failPhys = physResults < 90;
		boolean failChem = chemResults < 90;
		boolean failBio = bioResults < 90;
		
		
		if(failPhys || failChem || failBio == true) {
		if(failPhys == true) {
		
			System.out.println("You have failed Physics, try again");
		}
		if(failChem == true) {
			
			System.out.println("You have failed Chemistry, try again");
		}
			if(failBio == true) {
			
			System.out.println("You have failed Biology, try again");
					
		}
			System.out.println("Sorry - You have failed");
		
		}
		
		
		
	}
	
	public static int results(int physResults, int chemResults, int bioResults){
		
		int totalMark = physResults + chemResults + bioResults;
				
		System.out.println("Physics Mark: " + physResults + "/ 150" );
		System.out.println("Chemistry Mark: " + chemResults + "/ 150" );
		System.out.println("Biology Mark: " + bioResults + "/ 150");
		System.out.println("Total Marks: " + totalMark+ "/ 450");
		return totalMark;
				
	}
	
	
	public static float percent(float total) {
		
		float percent = ((total) * 100)/450;
		System.out.println("Total Percentage across all exams = " + percent + " %" );
		return percent;
		
			
	}
	
	
	
	

}
