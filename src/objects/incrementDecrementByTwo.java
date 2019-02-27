package objects;

import java.util.Scanner;

public class incrementDecrementByTwo {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a;
		a = myScanner.nextInt();
		System.out.println("The value is incremeneted with 2 and it is " + (a += 2));
		System.out.println("Now is decremented by 2 and its back to its original value " + (a -= 2));
	}
}
