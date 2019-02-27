package objects;

import java.util.Scanner;

public class minusOfTwoNumbers {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a, b, m;
		a = myScanner.nextInt();
		b = myScanner.nextInt();
		m = a - b;
		System.out.println(a + " - " + b + " = " + m);
	}
}
