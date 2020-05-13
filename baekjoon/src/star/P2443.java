package star;
import java.util.Scanner;

public class P2443 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();

		for (int i = 0; i < num; i++) {
			for (int j = 1; j < (2 * num); j++) {
				if (i >= j) {
					System.out.print(" ");
				} else if (j >= (2 * num) - i) {
					continue;
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
