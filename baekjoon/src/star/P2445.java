package star;

import java.util.Scanner;

public class P2445 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();

		for (int i = 1; i < number + 1; i++) {
			for (int j = 1; j < (number * 2) + 1; j++) {
				if (j <= i) {
					System.out.print("*");
				} else if (j > number * 2 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		for (int i = 1; i < number; i++) {
			for (int j = 1; j < (number * 2) + 1; j++) {
				if (j <= number - i) {
					System.out.print("*");
				} else if (j > number + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
