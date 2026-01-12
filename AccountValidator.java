package act.M4_Activity4;



public class AccountValidator {

	public AccountValidator() {
		
	}
	
	public void validateAccountNumber(String accountNumber) throws Exception {
	 	if (accountNumber == null) {
	 		throw new NullPointerException("Error: Cannot be null");
			
		}else if (accountNumber.length() != 10) {			
			throw new InvalidAccountNumberException("Error: Must be 10 digits");
		}else {
			System.out.println("Valid account: " + accountNumber);
		}
			
	   
	}
	
	
	public static class InvalidAccountNumberException extends Exception {
        public InvalidAccountNumberException(String message) {
            super(message);
        }
    
	}
	
	
	
}
