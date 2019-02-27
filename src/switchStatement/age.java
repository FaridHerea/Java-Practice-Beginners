package switchStatement;

import java.util.Scanner;

public class age {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int age;
		age = myScanner.hasNextInt();
		
		switch (age) {
		case 3:
			System.out.println("You can walk");
			break;
		case 14:
			System.out.println("Puberty is by the next corner");
			break;
		case 18:
			System.out.println("Congratulation! You can now go to jail!");
			break;
		case 23:
			System.out.println("No worries, life's just beginning at this age");
			break;
		case 30:
			System.out.println("Aren't you married yet?");
			break;
		case 40:
			System.out.println("You middle ager, you");
			break;
		case 50:
			System.out.println("Your close to retirement, good job on surviving this far");
			break;
		case 60:
			System.out.println("Its time for you to sit back and enjoy the life");
			break;
		case 70:
			System.out.println("If you haven't got the chance to pop these many pills in highschool, now its the time");
			break;
		default:
			System.out.println("Nothing special at your age!");
			break;
		}
	}
}
