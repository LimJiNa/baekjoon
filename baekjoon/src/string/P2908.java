package string;

import java.util.Scanner;

public class P2908 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String numbers = scan.nextLine();
		scan.close();

		String[] splitNumbers = numbers.split(" ");
		String reversLeftNumber = new StringBuilder(splitNumbers[0]).reverse().toString();
		String reversRightNumber = new StringBuilder(splitNumbers[1]).reverse().toString();
		int intLeftNumber = Integer.parseInt(reversLeftNumber);
		int intRightNumber = Integer.parseInt(reversRightNumber);
		if (intLeftNumber < intRightNumber) {
			System.out.println(intRightNumber);
		} else if (intRightNumber < intLeftNumber) {
			System.out.println(intLeftNumber);
		}
	}
}
