package garage;

public class Plane extends Vehicle {

	private int numOfWings;

	// Empty Constructor
	public Plane() {

		super();

	}

	// Completed Constructor
	public Plane(int numOfWings, int maxSpeed, String colour, int numOfWheels) {

		super(maxSpeed, numOfWheels, colour);
		this.numOfWings = numOfWings;

	}

	public int getNumOfWings() {
		return numOfWings;
	}

	public void setNumOfWings(int numOfWings) {
		this.numOfWings = numOfWings;
	}

	@Override
	public float calcBill() {
		
		return numOfWings * 55;
	}

}
