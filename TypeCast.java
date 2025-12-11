/**
 * 
 */
package act.M1_Activity2;

import java.util.Scanner;

/**
 * 
 */
public class TypeCast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);
		System.out.println("Enter your age: ");
		String ageGet = age.nextLine();
		
		int intAge = Integer.parseInt(ageGet);
		double doubleAge = Double.parseDouble(ageGet);
		
		System.out.println("Your age in int: " + intAge);
		System.out.println("Your age in double: " + doubleAge);        
	    age.close();
	}

}
