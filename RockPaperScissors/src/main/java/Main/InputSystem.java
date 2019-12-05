package Main;

import java.util.Scanner;
import java.util.Random;

public class InputSystem {

	public static int getPlayerInput() {
		int choice;

		while (true) {
			System.out.println("Select 1,2, or 3 for Rock, Paper or Scissors");

			Scanner in = new Scanner(System.in);

			choice = in.nextInt();

			if (choice == 1 || choice == 2 || choice == 3) {
				switch (choice) {

				case 1:
					System.out.println("Player chooses : Rock");
					return choice;
				case 2:
					System.out.println("Players chooses : Paper");
					return choice;

				case 3:
					System.out.println("Players chooses : Scissors");
					return choice;

				}

			}
		}

	}

	public static int getCPUInput() {
		Random rand = new Random();

		int CPU_choice = rand.nextInt(3 - 1 + 1) + 1;

		switch (CPU_choice) {

		case 1:
			System.out.println("CPU chooses : Rock");
			return CPU_choice;
		case 2:
			System.out.println("CPU chooses : Paper");
			return CPU_choice;

		case 3:
			System.out.println("CPU chooses : Scissors");
			return CPU_choice;

		}

		return 0;

	}

	public static void main(String[] args) {
		getPlayerInput();
		getCPUInput();
	}

}
