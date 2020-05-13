package star;
import java.util.Scanner;

public class P2441 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
			scan.close();
		}
	}
}
