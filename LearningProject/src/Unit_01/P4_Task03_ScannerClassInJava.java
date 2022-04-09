package Unit_01;

import java.util.Scanner;

/* When user takes input from the console!
 
 nextLine()       Reads user input (To read Strings)
 next()           Reads next token from the input entered by the user
 
 nextBoolean()    Reads a boolean value from the user
 nextByte()       Reads a byte value from the user
 nextDouble()     Reads a double value from the user
 nextFloat()      Reads a float value from the user
 nextInt()        Reads a int value from the user
 nextLine()       Reads a String value from the user
 nextLong()       Reads a long value from the user
 nextShort()      Reads a short value from the user
 
 */

public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {
		
		Scanner myobj1 = new Scanner(System.in);  // Creating a Scanner object
		Scanner myobj2 = new Scanner(System.in);
		
		// Read the first-token: (_ space bar)
		String firstName = myobj1.next();
		System.out.println("Name is: " + firstName + "\n");
		
		String name = myobj2.nextLine(); //(\n)
		String name2 = myobj2.nextLine(); //(\n)
		
		System.out.println("Name is: " + name + "\n");
		System.out.println("Name is: " + name2 + "\n");

	}

}
