package formoon;

import java.util.Scanner;

//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
//������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.

public class P2439 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		
		for(int i=1; i<=N; i++) {
			for(int j=N; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		scan.close();
	}
}
