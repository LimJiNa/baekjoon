package ifmoon;

/*
������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� �� �̴�.
�������, 2012���� 4�� ����� ����������, 1900���� 4�� ���������, 100�� ����̱� ������ ������ �ƴϴ�.
������, 2000���� 400�� ����̱� ������ �����̴�.
*/

import java.util.Scanner;

public class P2753 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();
		int four = year % 4;
		int four400 = year % 400;
		int one100 = year % 100;
		if ((four == 0 && one100 != 0) || four400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		scan.close();
	}
}