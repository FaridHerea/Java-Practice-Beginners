package objects;

import java.util.Scanner;

public class difAndChangeOfTwoNumbers {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		long a, b, d;
		long c;
		a = myScanner.nextInt();
		b = myScanner.nextInt();
		d = a / b;
		c = a % b;
		System.out.println(a + " / " + b + " = " + d + " (change " + c + ")");
	}
}
