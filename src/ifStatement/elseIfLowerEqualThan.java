package ifStatement;

import java.util.Scanner;

public class elseIfLowerEqualThan {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a, b;
		a = myScanner.nextInt();
		b = myScanner.nextInt();
		if (a < b) {
			System.out.println(a + " is lower than " + b);
		} else if (a == b){
			System.out.println(a + " is equal to " + b);
		} else {
			System.out.println(a + " is greater than " + b);
		}
	}
}
