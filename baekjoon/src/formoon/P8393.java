package formoon;

//n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

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
