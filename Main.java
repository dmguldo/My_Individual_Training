package act.M3_Activity3;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;

public class Main{


    	private static final Scanner scanner = new Scanner(System.in);
    	private static final LinkedHashMap<String, Integer> products = new LinkedHashMap<>();
 
    	
		public static void main(String[] args) {
			
			products.put("Keyboard",100);    
			products.put("Headset",100);   
			
            int choice;   	  
			
			do {	
				printMenu();
	            choice = userChoice("> ");
	            switch (choice) {
	                case 1 -> searchAProduct();
	                case 2 -> addAProduct();
	                case 3 -> printAllProductsAndCount();
	                case 4 -> findCheapestProduct();
	                case 5 -> { 
	                           System.out.println("Exiting... Thank you!"); }	                	
	                default -> System.out.println("Invalid choice. Please try again.");
	            }
	            System.out.println(); // spacer
	        } while (choice != 5 );

		}
		
	    private static void printMenu() {
	    	System.out.println("Select an option:");
			System.out.println("1. Search a Product ");
			System.out.println("2. Add a product ");
			System.out.println("3. Print all products and count ");
			System.out.println("4. Find the cheapest product  ");
			System.out.println("5. Exit ");
	    }	
	    
	    private static void searchAProduct() {
	        String name = prodName("Enter product name to search: ");
	        int s = findProduct(name);
	        if (s == 0) {
	            System.out.println("Product not found.");
	            return;
	        }
	        System.out.println("Product price: " + s);
	        	        
	    } 
	    
	    
	    private static int findProduct(String name) {
	    	for (Map.Entry<String, Integer> entry : products.entrySet()) {
	    		int price = entry.getValue();
	    		if (entry.getKey().matches(name)) {
	    		   return price;
	    		   
	    		}
	    	}
	        return 0;
	    }


	    private static void addAProduct() {

	        String name = prodName("Enter product name to add: ");	
	        int price = userChoice("Enter price: ");	
	        products.put(name,price);     
	        System.out.println("Product added: " + name);
	        	        
	    }
	    
	    private static void printAllProductsAndCount() {
	        System.out.println("\n All products: ");
	        if (products.isEmpty()) {
	            System.out.println("No product to display.");
	            return;
	        }
	        for (Map.Entry<String, Integer> entry : products.entrySet()) {
	            System.out.println(entry.getKey() + " - " + entry.getValue());	                      
	            }
	            
	            System.out.println("Total products: " + products.size());
	    }
	    
	    
	    private static void findCheapestProduct() {
	    	String cheapestName = null;
	    	int cheapestPrice = Integer.MAX_VALUE;
	        for (Map.Entry<String, Integer> entry : products.entrySet()) {
	          	String name = entry.getKey();
	           	int priceObj = entry.getValue();

	           	int price = priceObj;
	            	
	           	if (price < cheapestPrice) {
	           		cheapestPrice = price;
	           		cheapestName = name;
	           	}
	         }	 
	            System.out.println("Cheapest product: " + cheapestName + " - " + cheapestPrice);	        
	    }
	   
	    private static int userChoice(String prompt) {
	        String line;
	        do {
	            System.out.print(prompt);
	            line = scanner.nextLine();
	            if (line == null) line = "";
	            line = line.trim();
	            if (line.isEmpty()) {
	                System.out.println("Input cannot be empty. Please try again.");
	            }
	        } while (line.isEmpty());
	        return Integer.parseInt(line);
	    }
	    
	       
	    private static String prodName(String prompt) {
	        String line;
	        do {
	            System.out.print(prompt);
	            line = scanner.nextLine();
	            if (line == null) line = "";
	            line = line.trim();
	            if (line.isEmpty()) {
	                System.out.println("Input cannot be empty. Please try again.");
	            }
	        } while (line.isEmpty());
	         return line;
	    }

}
