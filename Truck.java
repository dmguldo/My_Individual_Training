package act.m2activity6;

public class Truck extends Vehicle{

		public Truck(int numberOfWheels, String brand) {
			super(numberOfWheels,brand);
		}
	
      
	  public void refuel(){
		   System.out.println(this.getBrand() + " truck with " + this.getNumOfWheels() + " wheels is refueling...");
	   
	   }
	   
	   @Override
	   public void startEngine(){
		   System.out.println("Truck engine is starting...");
	   }
	   
	   @Override
	   public void destroy(){
		   System.out.println("Destroying Truck...");
	   }
}
