package act.M2_Activity6;

public class Car extends Vehicle{
   
	public Car(int numberOfWheels, String brand) {
		super(numberOfWheels,brand);
	}
	
	
   public void refuel(){
	   System.out.println(this.getBrand() + " car with " + this.getNumOfWheels() + " wheels is refueling...");
   }
   
   @Override
   public void startEngine(){
	   System.out.println("Car engine is starting...");
   }
   
   @Override
   public void destroy(){
	   System.out.println("Destroying car...");
   }
}
