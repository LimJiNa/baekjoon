package formoon;

import java.util.Scanner;

//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.

public class P11021 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		for (int i = 1; i <= T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println("Case #" + i + ": " + (A+B));
		}
		scan.close();
	}
}
