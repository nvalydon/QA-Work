package Main;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public static List<String> vehicles = new ArrayList<String>();

	public List<String> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<String> vehicles) {
		this.vehicles = vehicles;
	}

	public float calculateBill() {
		float bill = 0;

		for (int i = 0; i < getVehicles().size(); i++) {

			if (vehicles instanceof Car) {

				float price = 10000;

			} else if (vehicles instanceof Motorbike) {

				float price = 12000;

			} else if (vehicles instanceof Truck) {

				float price = 15000;

			}
		}
		return bill;

	}

	public static void addVehicle(String vehicle_name) {
		
		
		vehicles.add(vehicle_name);
		
		
		
		
	}












}
