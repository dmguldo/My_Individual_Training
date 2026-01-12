package act.M4_Activity5;



public class Main {

	public static void main(String[] args) {
		AccountValidator account = new AccountValidator();
		
		System.out.println("=== Account Number Validation Test ===");
		System.out.println();
		account.testValidation("Test1", "1234567890");		
		account.testValidation("Test2", "123");	
		account.testValidation("Test3", "12345ABC90");		
		account.testValidation("Test4", "1234 567890");	
		account.testValidation("Test5", "");

	}
	
	

}
