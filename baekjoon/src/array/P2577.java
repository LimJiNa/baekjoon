package array;

import java.util.Scanner;

public class P2577 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A, B, C = 0;
		int total = 0;

		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();

		total = A * B * C;
		int[] totalArray = new int[10];

		while (total > 0) {
			totalArray[total % 10]++;
			total = total / 10;
		}

		for (int re : totalArray) {
			System.out.println(re);
		}

		scan.close();
	}
}
