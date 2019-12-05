package Main;

public class App extends Garage{

	public static void main(String[] args) {

		Garage g = new Garage();
		g.getVehicles().add("Batmobile") ;
		g.getVehicles().add("Monster Truck");
		g.getVehicles().add("Dirt Bike");
		//g.getVehicles().add("DMC Dalorean");
		System.out.println(g.vehicles);
		
		//addVehicle("DMC Dalorean");
		

	}
}