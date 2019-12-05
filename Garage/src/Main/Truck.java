package Main;

public class Truck extends Vehicle {

	public Truck() {

		super("Diesel", "Blue", 4, 6, 3200.00);

	}

	boolean hasSeatbelt = true;

	boolean hasAirbag = true;

	public boolean isHasSeatbelt() {
		return hasSeatbelt;
	}

	public void setHasSeatbelt(boolean hasSeatbelt) {
		this.hasSeatbelt = hasSeatbelt;
	}

	public boolean isHasAirbag() {
		return hasAirbag;
	}

	public void setHasAirbag(boolean hasAirbag) {
		this.hasAirbag = hasAirbag;
	}

}
