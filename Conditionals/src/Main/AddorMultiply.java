package Main;

public class AddorMultiply {

	public static int conditonals(int num1, int num2, boolean a) {
		if(num1 % 2 != 0 || num2 % 2 != 0) {
		if (a == true) {

			int num = num1 + num2;
			System.out.println(num);
			return num;

		} else {

			int num = num1 * num2;
			System.out.println(num);
			return num;

		}

	}
		return 0;
	}

	public static String appendixA(int A) {

		if (A > 2000) {

			System.out.println("A");

			if (A > 6000) {

				System.out.println("C");

			} else {

				System.out.println("B");
				if (A > 4000) {

					System.out.println("D");

				} else {

					System.out.println("E");

				}
			}

		} else {

			System.out.println("1");

			if (A > 100) {

				System.out.println("3");

				if (A > 600) {

					System.out.println("5");

				} else {

					System.out.println("4");

					if (A > 500) {

						System.out.println("6");

					} else {

						System.out.println("7");
					}

				}

			} else {

				System.out.println("2");

			}

		}
		return null;

	}

}
