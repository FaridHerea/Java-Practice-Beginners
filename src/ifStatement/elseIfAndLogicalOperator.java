package ifStatement;

import java.util.Scanner;

public class elseIfAndLogicalOperator {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a, b, c;
		a = myScanner.nextInt();
		b = myScanner.nextInt();
		c = myScanner.nextInt();
		if (a > b && b > c) {
			System.out.println(a + " > " + b + " > " + c);
		} else if (a < b && b > c){
			System.out.println(a + " < " + b + " >" + c);
		} else if (a > b && b < c) {
			System.out.println(a + " > " + b + " < " + c);
		} else if (a < b && b < c) {
			System.out.println(a + " < " + b + " < " + c);
		}
	}
}
