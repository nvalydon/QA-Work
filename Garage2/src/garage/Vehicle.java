package garage;

public abstract class Vehicle {
	private int maxSpeed;
	private int numOfWheels;
	private String colour;
	
	//Unsure about this
	public Class<?> getClass;

	// Empty Constructor
	public Vehicle() {
		super();
	}

//Completed Constructor
	public Vehicle(int maxSpeed, int numOfWheels, String colour) {
		super();
		this.maxSpeed = maxSpeed;
		this.numOfWheels = numOfWheels;
		this.colour = colour;

	}

	public abstract float calcBill();

//Getters and Setters
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	// Final Print
	@Override
	public String toString() {

		return "Vehicle [Colour=" + colour + ", maxSpeed=" + maxSpeed + ", numOfWheels=" + numOfWheels + "]";

	}

}
