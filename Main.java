package act.M4_Activity3;



public class Main {

	public static void main(String[] args) {
		ATMTransaction atm = new ATMTransaction();
        
		System.out.println("=== ATM BALANCE INQUIRY SYSTEM ===");
		System.out.println();
		System.out.println("--- Test Case 1: Valid Savings Account ---");
		atm.checkBalances("100123456",15000.00);
		
		System.out.println("--- Test Case 2: Valid Checking Account ---");
		atm.checkBalances("200987654",25000.00);
		
		System.out.println("--- Test Case 3: Invalid Account Number Format ---");
		atm.checkBalances("ABC12345",15000.00);
		
		System.out.println("--- Test Case 4: Empty Account Number ---");
		atm.checkBalances("",15000.00);

	}

}
