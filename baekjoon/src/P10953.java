import java.util.Scanner;

public class P10953 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testNumber = scan.nextInt();

		for (int i = 0; i < testNumber; i++) {
			String numbers = scan.next();
			String[] splitNumber = numbers.split(",");
			System.out.println(Integer.parseInt(splitNumber[0]) + Integer.parseInt(splitNumber[1]));
		}
		scan.close();
	}
}
