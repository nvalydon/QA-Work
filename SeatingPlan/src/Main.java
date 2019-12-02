import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		int numSeat = 6;
		

		String[] seatingPlan = new String[] { "AM", "AR", "AT", "AW", "CA", "CJ", 
											  "ER", "ED", "HH", "JB", "JK", "JL",
											  "JG", "LM", "LC", "LCh", "LC", "LH",
											  "MF", "NV", "RR", "TK", "ZZ" };
		
		List<String> sp = Arrays.asList(seatingPlan);

		Collections.shuffle(sp);

		//String sp1 = Arrays.deepToString(seatingPlan);
  
		//System.out.println(seatingPlan.length);
								 
												 
		for (int i=1; i < seatingPlan.length; i++) {
			System.out.print(" ");
			
			String Name = sp.get(i);
			
			System.out.print(Name);
			
			if (i == numSeat || i == numSeat * 2 || i == numSeat * 3 || i == numSeat * 4) {
				
				System.out.println(" ");
				
			}

		}

	}

}
