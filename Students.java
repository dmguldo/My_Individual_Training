package act.exerone;

public class Students {

	public static void main(String[] args) {
		Car mazda = new Car("Sedan","Red","Mazda 2020");
		Car bmw = new Car();
				
		mazda.getCarInfo();
		
		bmw.setType("SUV");
		bmw.setColor("Black");
		bmw.setModel("BMW 2024");
		bmw.getCarInfo();				
		
	}

}
