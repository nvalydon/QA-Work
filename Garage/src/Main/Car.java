package Main;

public class Car extends Vehicle {

	public Car() {

		super("Petrol", "Red", 3, 4, 1200.00);

	}

	boolean hasSeatbelt = true;

	boolean hasBoot = true;

	boolean hasAirbag = true;

	public boolean isHasSeatbelt() {
		return hasSeatbelt;
	}

	public void setHasSeatbelt(boolean hasSeatbelt) {
		this.hasSeatbelt = hasSeatbelt;
	}

	public boolean isHasBoot() {
		return hasBoot;
	}

	public void setHasBoot(boolean hasBoot) {
		this.hasBoot = hasBoot;
	}

	public boolean isHasAirbag() {
		return hasAirbag;
	}

	public void setHasAirbag(boolean hasAirbag) {
		this.hasAirbag = hasAirbag;
	}

}
