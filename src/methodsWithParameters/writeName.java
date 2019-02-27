package methodsWithParameters;

import java.util.Scanner;

public class writeName {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		subWriteName nameObject = new subWriteName();
		
		System.out.print("Enter your name here: ");
		String name = myScanner.nextLine();
		
		nameObject.myName(name);
	}
}
