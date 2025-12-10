package act.m2activity6;

public abstract class Vehicle implements Refuelable {
	
	private int numberOfWheels;
	private String brand;
		
	public Vehicle(int numberOfWheels, String brand) {
		this.numberOfWheels = numberOfWheels;
		this.brand = brand;
	}
	
	abstract void startEngine();
	
		
	public void setNumOfWheels(int numberOfWheels) {
	     this.numberOfWheels = numberOfWheels;
	}
	
	public int getNumOfWheels() {
	      return numberOfWheels;
	}
	
	public void setBrand(String brand) {
	     this.brand = brand;
	}
	
	public String getBrand() {
	      return brand;
	}
	
	
	
	public void destroy() {
			System.out.println("Destroying Car...");	
	}
}