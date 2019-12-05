package garage;

public class Boat extends Vehicle {

	private String propulsionType;

//Empty Constructor
	public Boat() {

		super();

	}

//Completed Constructor
	public Boat(int maxSpeed, String colour, int numOfWheels, String propulsionType) {
		// Be careful with the order at which you put stuff into super, must match that
		// of the parent class one i think
		super(maxSpeed, numOfWheels, colour);
		this.propulsionType = propulsionType;

	}

	@Override
	public float calcBill() {
		return getMaxSpeed();

	}
//Setters and Getters
	public String getPropulsionType() {
		return propulsionType;
	}

	public void setPropulsionType(String propulsionType) {
		this.propulsionType = propulsionType;
	}
	
	
	

}
