package formoon;

import java.util.Scanner;

//�ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class P2742 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

//		for(int i=N; i>0; i--) {			
//			System.out.println(i);
//		}
		for (int i = 0; i < N; i++) {
			System.out.println(N - i);
		}
		scan.close();
	}
}
