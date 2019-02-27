package ifStatement;

import java.util.Scanner;

public class greaterEqualThan {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a, b;
		a = myScanner.nextInt();
		b = myScanner.nextInt();
		if (a >= b) {
			System.out.println(a + " is greater or equal to " + b);
		} else {
			System.out.println(a + " is not greater nor equal to " + b);
		}
	}
}
