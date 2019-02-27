package objects;

import java.util.Scanner;

public class prodOfTwoNumbers {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a, b, p;
		a = myScanner.nextInt();
		b = myScanner.nextInt();
		p = a * b;
		System.out.println(a + " * " + b + " = " + p);
	}
}
