/**
 * 
 */
package act.hello;

import java.util.Scanner;

/**
 * 
 */
public class myHello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your Name: ");
		String name = scanner.nextLine();
		System.out.println("Hello, " + name + "!");
		scanner.close();
	}

}
