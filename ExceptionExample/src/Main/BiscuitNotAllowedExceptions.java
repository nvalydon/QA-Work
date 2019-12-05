package Main;

public class BiscuitNotAllowedExceptions extends RuntimeException {

	public static void main(String[] args) {

		throw new BiscuitNotAllowedExceptions();

	}

}
