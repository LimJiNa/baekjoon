package formoon;

//N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.

import java.util.Scanner;

public class P2739 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for (int j = 1; j <= 9; j++) {
			System.out.println(N + " * " + j + " = " + N * j);
		}
		scan.close();
	}
}
