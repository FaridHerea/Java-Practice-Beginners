package ifStatement;

import java.util.Scanner;
import java.util.Scanner;

public class greaterThan {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a, b;
		a = myScanner.nextInt();
		b = myScanner.nextInt();
		if (a < b) {
			System.out.println(b + " is greater than " + a);
		} else {
			System.out.println(b + " is NOT greater than " + a);
		}
	}
}
