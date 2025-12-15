package act.M3_Activity1;

import java.util.ArrayList;

import java.util.Scanner;

public class Product {
	
	public static void main(String[] args) {
		 ArrayList<String> products = new ArrayList<>();
		 
		  // Add products to the list
			products.add("Laptop");
			products.add("Mouse");
	        products.add("Keyboard");
	        products.add("Monitor");
	        products.add("Printer");
	        
	        // Display the products
	        System.out.println("All Products:");
	        for (int i = 0; i < products.size(); i++) {
	            System.out.println(i+1 + ". " + products.get(i));
	        }
	        
	        products.remove(1);
	        products.add("Webcam");
	        
	     // Display the products
	        System.out.println("After adding and removing products:");
	        for (int i = 0; i < products.size(); i++) {
	            System.out.println(i+1 + ". " + products.get(i));
	        }
	        
	        Scanner scanner = new Scanner(System.in);
			System.out.print("Enter product name to search: ");
			String productName = scanner.nextLine();
			
			int exactIndex = indexOfIgnoreCase(products, productName);
	        if (exactIndex != -1) {
	            System.out.println("Product found: " + products.get(exactIndex));
	        } else {
	            System.out.println("Product not found");
	        }
	        
	        scanner.close();

	}
	
    private static int indexOfIgnoreCase(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    

}
