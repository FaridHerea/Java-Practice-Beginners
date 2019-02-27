package getSetParameters;

import java.util.Scanner;

public class girl {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		subGirl girlObject = new subGirl();
		System.out.println("Enter name of first gf here: ");
		String temp = myScanner.nextLine();
		girlObject.setName(temp);
		girlObject.saying();
	}
}
