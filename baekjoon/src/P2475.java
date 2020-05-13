import java.util.Scanner;

public class P2475 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] serialNumber = new int[5];
		int[] serialTwoNumber = new int[5];
		int sum = 0;

		for (int i = 0; i < serialNumber.length; i++) {
			serialNumber[i] = scan.nextInt();
			serialTwoNumber[i] = (serialNumber[i] * serialNumber[i]);
			sum += serialTwoNumber[i];
		}
		System.out.println(sum % 10);
		scan.close();
	}
}
