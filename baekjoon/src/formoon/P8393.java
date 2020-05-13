package formoon;

//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class P8393 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int total = 0;

		for (int i = 0; i <= N; i++) {
			total += i;
		}
		System.out.println(total);
		
		scan.close();
	}
}
