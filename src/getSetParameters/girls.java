package getSetParameters;

import java.util.Scanner;

public class girls {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in) ;
		subGirls myGirls = new subGirls();
		System.out.println("Enter the name of your 1st gf: ");
		String first = myScanner.nextLine();
		System.out.println("How about your second gf's name? ");
		String second = myScanner.nextLine();
		myGirls.setName(first, second);
		myGirls.saying();
	}
}
