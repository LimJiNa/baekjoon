package star;

import java.util.Scanner;

public class P2446 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();

		for (int i = 0; i < number; i++) {
			for (int j = 1; j < number * 2; j++) {
				if (i >= j) {
					System.out.print(" ");
				} else if (j >= number * 2 - i) {
					continue;
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

		for (int i = 0; i < number - 1; i++) {
			for (int j = 1; j < number * 2; j++) {
				if (j < (number - i) - 1) {
					System.out.print(" ");
				} else if ((number + i) + 1 < j) {
					continue;
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
