package objects;

import java.util.Scanner;

public class incrementDecrementByOne {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a;
		a = myScanner.nextInt();
		System.out.println(a++ + " is incremented by 1 after reading, if read again is " + a);
		System.out.println(a-- + " is decremented by 1 after reading, if read again is " + a);
		System.out.println(++a + " now its incremented by 1 before reading");
		System.out.println(--a + " now its decremented by 1 before reading");
	}
}
