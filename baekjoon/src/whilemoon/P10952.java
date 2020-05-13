package whilemoon;

import java.util.Scanner;

public class P10952 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A;
		int B;
		int hap = 0;
		String print = "";

		while (true) {
			A = scan.nextInt();
			B = scan.nextInt();
			hap = (A + B);
			if (A == 0 && B == 0) {
				break;
			}
			print += hap + "\n";
		}
		System.out.println(print);

		scan.close();
	}
}
