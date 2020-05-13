package string;

import java.util.Scanner;

public class P2675 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();

		for (int i = 0; i < num1; i++) {
			int num2 = scan.nextInt();
			String words = scan.next();
			for (int j = 0; j < words.length(); j++) {
				for (int k = 0; k < num2; k++) {
					System.out.print(words.charAt(j));
				}
			}
			System.out.println("");
		}
		scan.close();
	}
}
