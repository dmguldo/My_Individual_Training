package act.M4_Activity4;


public class Main {

	public static void main(String[] args) {
		
		AccountValidator account = new AccountValidator();
		
		try {
			account.validateAccountNumber("1234567890");
			}catch (Exception e) {
				System.out.println("Error: Transaction Failed!");
			}
		
		try {	
		account.validateAccountNumber("123");
		}catch (Exception e) {
			System.out.println("Error: Must be 10 digits!");
		}
		
		try {
		account.validateAccountNumber(null);
		}catch (Exception e) {
			System.out.println("Error: Cannot be null");
		}
		

	}

}
