package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			Divide.getAnswer(s.nextDouble(), s.nextDouble());
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		s.close();
	}
}
