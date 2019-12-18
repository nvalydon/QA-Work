package main;

public class App {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FosburyFlop");

			} else if (i % 5 == 0) {

				System.out.println("Flop");

			} else if (i % 3 == 0) {
				System.out.println("Fosbury");

			} else {

				System.out.println(i);

			}

		}

	}

}
