package objects;

import java.util.Scanner;

public class sumOfTwoNumbers {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a , b, s;
		a = myScanner.nextInt();
		b = myScanner.nextInt();
		s = a + b;
		System.out.println( a + "+" + b + "=" + s);
	}
}
