package Main;

public class Divide{

	public static double getAnswer(double num1, double num2) {

		try {
			return num1 / num2;
			
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			

		}return 0;
		

	}

}