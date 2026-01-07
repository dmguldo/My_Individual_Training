package act.M4_Activity3;

public class ATMTransaction {

	public ATMTransaction() {
		
	}
	
	public void checkBalances(String accountNumber, double balance) {
		int accountNum;
		try {
			
        	System.out.println("Processing balance inquiry...");
        	char accountType = accountNumber.charAt(0);
        	
            accountNum = Integer.parseInt(accountNumber);
            
            
            if (accountType == '1') {
        		System.out.println("Account Type : Savings");
        		
            }else if(accountType == '2') {
            	System.out.println("Account Type : Checking");
            }else {
            	System.out.println("Account Type : Unknown");
            }
            
            System.out.println("Account Number: " + accountNum);
            System.out.printf("Current Balance: ₱" + "%.2f%n", balance);
            System.out.println("Balance inquiry successful!");
            
       
		} catch (StringIndexOutOfBoundsException e) {
	       	 System.out.println("Error: Account number is empty or invalid");
	       	 displayReceipt();
	       	 return;
	       	 
		} catch (NumberFormatException e) {
         System.out.println("Error: Invalid account number format!");
         System.out.println("Account numbers must be numeric!");    
         displayReceipt();
         return; 
                                      

       }  
		displayReceipt();
	}
	
	public void displayReceipt() {
		System.out.println();
		System.out.println("========== RECEIPT ==========");
		System.out.println("Transaction Date: Dec 3, 2025");
		System.out.println("Transaction Type: Balance Inquiry");
		System.out.println("ATM Location: Main Branch");
		System.out.println("Thank you for banking with us!");
		System.out.println("=============================");
		System.out.println();
	}

}
