package act.M4_Activity5;

public class AccountValidator {

	public AccountValidator() {
	
	}
	
	public static class InvalidAccountFormatException extends RuntimeException {
        public InvalidAccountFormatException(String message) {
            super(message);
        }
	}

	public static class InvalidAccountNumberException extends Exception {
        public InvalidAccountNumberException(String message) {
            super(message);
        }
    
	}
	
	
	
	public void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException {
		
		
		for (char c:accountNumber.toCharArray()) {
			if(!Character.isDigit(c)) {
				throw new InvalidAccountFormatException("Error: Account number must contain only digits \n");
			}
		}
			
		if (accountNumber == null || accountNumber.isEmpty()) {
            throw new NullPointerException("Warning: Account number cannot be null \n");
        }else if(accountNumber.length()!= 10) {
			throw new InvalidAccountNumberException("Error: Account number must be exactly 10 digits \n");
		}else {
			System.out.println("Valid Account number: " + accountNumber + "\n");
		}
		
		
		   
	}
	
	public void testValidation(String testName, String accountNumber) {
		if (testName == "Test1") {
		   System.out.println("Test 1: Valid Account (" + accountNumber + ")");
		} else if(testName == "Test2") {
			System.out.println("Test 2: Too Short (" + accountNumber + ")");
		} else if (testName == "Test3") {
			System.out.println("Test 3: Contains letters (" + accountNumber + ")");
		} else if(testName == "Test4") {
			System.out.println("Test 4: Contains space (" + accountNumber + ")");
		} else if(testName == "Test5") {
			System.out.println("Test 5: Null value");
		}
		
		try {
			validateAccountNumber(accountNumber);	
	    }catch (InvalidAccountNumberException e) {
			System.err.println(e.getMessage());
		}catch (InvalidAccountFormatException e) {		
			System.err.println(e.getMessage());
		}catch (NullPointerException e) {		
			System.err.println("Warning: Account number cannot be null");	
		}
		
	}
	
	

}
