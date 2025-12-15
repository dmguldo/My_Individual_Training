package act.M3_Activity2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{


    	private static final Scanner scanner = new Scanner(System.in);
    	private static final List<Product> products = new ArrayList<>();
    	
		public static void main(String[] args) {
            int choice;   	  
			
			do {	
				printMenu();
	            choice = userChoice("> ");
	            switch (choice) {
	                case 1 -> searchAProduct();
	                case 2 -> addAProduct();
	                case 3 -> printAllProductsAndCount();
	                case 4 -> { 
	                           System.out.println("Exiting... Thank you!"); }	                	
	                default -> System.out.println("Invalid choice. Please try again.");
	            }
	            System.out.println(); // spacer
	        } while (choice != 4 );

		}
		
	    private static void printMenu() {
	    	System.out.println("Select an option:");
			System.out.println("1. Search a Product ");
			System.out.println("2. Add a product ");
			System.out.println("3. Print all products and count ");
			System.out.println("4. Exit ");
	    }	
	    
	    private static void searchAProduct() {
	        String name = prodName("Enter product name to search: ");
	        Product s = findProduct(name);
	        if (s == null) {
	            System.out.println("Product not found.");
	            return;
	        }
	        System.out.println("Product found: " + s.getProdName());
	        	        
	    } 
	    
	    
	    private static Product findProduct(String name) {
	        for (Product s: products) {
	            if (s.getProdName().equalsIgnoreCase(name.trim())) return s;
	        }
	        return null;
	    }


	    private static void addAProduct() {

	        String name = prodName("Enter product name to add: ");	
	        System.out.println(name);
	        products.add(new Product(name));     
	        System.out.println("Product added: " + name);
	        
	    }
	    
	    private static void printAllProductsAndCount() {
	        System.out.println("\n All products: ");
	        if (products.isEmpty()) {
	            System.out.println("No product to display.");
	            return;
	        }
	        for (Product s : products) {
	            System.out.println(s.getProdName());	                      
	            }
	            
	            System.out.println("Total unique products: " + products.size());
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
