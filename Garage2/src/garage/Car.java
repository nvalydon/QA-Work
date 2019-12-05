package garage;

public class Car extends Vehicle {

	private int bootSpace;


	//Empty Constructor	
	public Car() {
		super();

	}

//Completed Constructor for Car
	public Car(int maxSpeed, int numOfWheels, String colour) {
		super(maxSpeed, numOfWheels, colour);

		// Since new variable specific to car, must include in constructor
		this.bootSpace = bootSpace;

	}

	@Override
	public float calcBill() {
		return bootSpace * 10;
	}
	
	//Setters and Getters
	
	public int getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}


}
