package Main;

public class App {

	public static void main(String[] args) {

		taxes(52000);

	}

	public static double taxes(int salary) {

		if (salary >= 0 && salary <= 14999) {

			double tax = 0 * salary;
			System.out.println(tax);
			return tax;

		} else if (salary >= 15000 && salary <= 19999) {

			double tax = 0.1 * salary;
			System.out.println(tax);
			return tax;

		} else if (salary >= 20000 && salary <= 29999) {

			double tax = 0.15 * salary;
			System.out.println(tax);
			return tax;

		} else if (salary >= 30000 && salary <= 44999) {

			double tax = 0.2 * salary;
			System.out.println(tax);
			return tax;

		} else if (salary >= 45000) {

			double tax = 0.25 * salary;
			System.out.println(tax);
			return tax;

		}
		return salary;

	
	
}
	

//		
//		
//		
//		}
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
