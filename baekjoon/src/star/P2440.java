package star;
import java.util.Scanner;

public class P2440 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();

		for (int i = 0; i < number; i++) {
			for (int j = i; j < number; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scan.close();
	}
}
