package Main;

public class Motorbike extends Vehicle {

	public Motorbike() {

		super("Petrol", "Red", 2, 2, 1600.00);

	}
	
	boolean hasHandlebar = true;

	public boolean isHasHandlebar() {
		return hasHandlebar;
	}

	public void setHasHandlebar(boolean hasHandlebar) {
		this.hasHandlebar = hasHandlebar;
	}

	public void wheelie() {

	System.out.println("Weeeeeeeeeeeeeeeeeeeee");

	}

	

}
