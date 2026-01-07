package act.M4_Activity1;

public class BankAccount {
	String accountName = "";
    public BankAccount() {
		
	}
	public void getAccountNameString(String accountNumber) {
		
        try {
            if ("ACC-001".equals(accountNumber)) {
                accountName = "JUAN DELA CRUZ";
                System.out.println("Looking up account: " + accountNumber);
                System.out.println("Account Holder: " + accountName);
                System.out.println();
                
            } else if ("ACC-002".equals(accountNumber)) {
                accountName = "Maria Santos";
                System.out.println("Looking up account: " + accountNumber);
                System.out.println("Account Holder: " + accountName);
                System.out.println();
            } else {
            	System.out.println("Looking up account: " + accountNumber);
                throw new IllegalArgumentException("Account not found!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println(" ");
        }
               
	}
	
   
}
