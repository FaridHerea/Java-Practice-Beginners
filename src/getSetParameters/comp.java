package getSetParameters;

import java.util.Scanner;

public class comp {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		subComp myComp = new subComp();
		
		System.out.println("What's your name?");
		String name = myScanner.nextLine();
		System.out.println("What do you like the most?");
		String like = myScanner.nextLine();
		System.out.println("What do you hate the most?");
		String hate = myScanner.nextLine();
		myComp.setComp(name, hate, like);
		myComp.saying();
	}
}
