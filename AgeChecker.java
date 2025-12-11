/**
 * 
 */
package act.M1_Activity4;

import java.util.Scanner;


public class AgeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        
        if(age>=60) {
        	System.out.println("Senior");
        } else if(age>=18) {
        	System.out.println("Adult");
        }else {
        	System.out.println("Minor");
        }
        
        scanner.close();

	}

}
