package act.M2_Activity3;

public class Car {
	private String type;
	private String color;
	private String model;
	
	public Car(String type, String color, String model) {
		this.type = type;
		this.color = color;
		this.model = model;
		
	}
	
	public Car() {
		
	}
	
	public void setType(String type) {
		this.type = type;
		
	}
	public String getType() {
		return this.type;
		
	}
	
	public void setColor(String color) {
		this.color = color;
		
	}
	
	public String getColor() {
		return this.color;
		
	}
	
	public void setModel(String model) {
		this.model = model;
		
	}
	
	public String getModel() {
		return this.model;
		
	}
	
	public void getCarInfo() {
		System.out.println("===== Car Details ====");
		System.out.println("Type : " + this.type);
		System.out.println("Color: " + this.color);
		System.out.println("Model: " + this.model);
	}
	

}
