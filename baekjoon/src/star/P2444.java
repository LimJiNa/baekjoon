package star;
import java.util.Scanner;

public class P2444 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();

		for (int i = 0; i < number; i++) {
			for (int j = 1; j < (number * 2); j++) {
				if (j < number - i) {
					System.out.print(" ");
				} else if (number + i < j) {
					continue;
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

		for (int i = 1; i < number; i++) {
			for (int j = 1; j < (2 * number); j++) {
				if (i >= j) {
					System.out.print(" ");
				} else if (j >= (2 * number) - i) {
					continue;
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
