package Main;

abstract class Vehicle {

	private String typeOfFuel;
	private String colour;
	private int numOfMirrors;
	private int numOfWheels;
	private double price;

	public String getTypeOfFuel() {
		return typeOfFuel;
	}

	public void setTypeOfFuel(String typeOfFuel) {
		this.typeOfFuel = typeOfFuel;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumOfMirrors() {
		return numOfMirrors;
	}

	public void setNumOfMirrors(int numOfMirrors) {
		this.numOfMirrors = numOfMirrors;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Vehicle(String typeOfFuel, String colour, int numOfMirrors, int numOfWheels, double price) {

		this.setTypeOfFuel(typeOfFuel);
		this.setColour(colour);
		this.setNumOfMirrors(numOfMirrors);
		this.setNumOfWheels(numOfWheels);
		this.setPrice(price);

	}

}
