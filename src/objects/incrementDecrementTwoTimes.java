package objects;

import java.util.Scanner;

public class incrementDecrementTwoTimes {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a;
		a = myScanner.nextInt();
		System.out.println("The value incremented two times is " + (a *= 2));
		System.out.println("Decremented two times get back to its original value which is " + (a /= 2));
	}
}
