package star;
import java.util.Scanner;

public class P2442 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();

		for (int i = 0; i < number; i++) {
			for (int j = 1; j < (2 * number); j++) {
				if (j < (number - i)) {
					System.out.print(" ");
				} else if ((number + i) < j) {
					continue;
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
