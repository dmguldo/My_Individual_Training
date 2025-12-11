package act.M2_Activity5;

public class MSExcel extends Program {
	
	public MSExcel(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		String message = "Opening MS Excel...";   	
		System.out.println(message);
		this.setIsRunning(true);
		
	}
	
	@Override
	public void stop() {
		String message = "Stopping MS Excel...";      		 
		System.out.println(message);
		this.setIsRunning(false);
	}
}
