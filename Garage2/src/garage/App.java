package garage;

public class App {
	
	public static void main(String[] args) {
		Garage g = new Garage();
		g.addVehicle(new Car(50,4, "Red"));
		g.addVehicle(new Boat(200, "Red",0, "prop" ));
		g.addVehicle(new Plane(2,50000, "blue", 4));
		
		g.printVehicles();
		
		//g.removeVehiclesByType(Vehicle.);
		//g.printVehicles();
	}
	
	
	
	
	
	
	
	

}
