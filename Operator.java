/**
 * 
 */
package act.M1_Activity3;

import java.util.Scanner;

/**
 * 
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Compute results
        int sum = a + b;
        int difference = a - b; // a minus b
        int product = a * b;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        scanner.close();

	}


}
