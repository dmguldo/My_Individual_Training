package act.m2activity6;

public class MyApplication {

	public static void main(String[] args) {
		Vehicle car = new Car(4, "BMW");
		Vehicle truck = new Truck(10, "FOTON");	
			
		vehicleRefueling(car);
		vehicleRefueling(truck);
		startVehicle(car);
		startVehicle(truck);
		destroyVehicle(car);
		destroyVehicle(truck);
		
	}
	
	private static void vehicleRefueling(Vehicle vehicle) {
		vehicle.refuel();		
	}	
	
	

	private static void startVehicle(Vehicle vehicle) {
		vehicle.startEngine();		
	}	
	
	private static void destroyVehicle(Vehicle vehicle) {
		vehicle.destroy();		
	}
	
	

}
