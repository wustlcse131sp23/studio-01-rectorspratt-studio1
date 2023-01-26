package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("name");
		System.out.print("Enter value for arg 0: ");
		System.out.println("What is your name?");
		String s0 = in.nextLine();
		System.out.print("Enter name ");
		String s1 = in.nextLine();
		System.out.print("Enter name ");
		String s2 = in.nextLine();
		System.out.print("Enter name ");
		String s3 = in.nextLine();
		System.out.println("Enter name ");
		System.out.print("Greetings" + ", " + s0 + ", " + s1 + ", " + s2 + ", " + s3 + ".");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
