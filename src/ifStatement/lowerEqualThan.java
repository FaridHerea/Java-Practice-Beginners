package ifStatement;

import java.util.Scanner;

public class lowerEqualThan {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a, b;
		a = myScanner.nextInt();
		b = myScanner.nextInt();
		if (a <= b) {
			System.out.println(a + " is less or equal to " + b);
		} else {
			System.out.println(a + " is not less nor equal to " + b);
		}
	}
}
