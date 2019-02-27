package ifStatement;

import java.util.Scanner;

public class lowerThan {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a, b;
		a = myScanner.nextInt();
		b = myScanner.nextInt();
		if (a < b) {
			System.out.println(a + " is lower than " + b);
		} else {
			System.out.println(a + " is NOT lower than " + b);
		}
	}
}
