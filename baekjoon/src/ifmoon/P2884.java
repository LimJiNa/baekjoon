package ifmoon;

/*
����̴� ���� ��ħ �˶��� ��� �Ͼ��. �˶��� ��� �ٷ� �Ͼ�� �����̰�����, �׻� ���ݸ� �� �ڷ��� ���� ������ ���� �б��� �����ϰ� �ִ�.
����̴� ��� ����� �����غ�������, ���ݸ� �� �ڷ��� ������ �� � �͵� ���� ���� ������.
�̷� ����̸� �ҽ��ϰ� ����, â���̴� �ڽ��� ����ϴ� ����� ��õ�� �־���.
�ٷ� "45�� ���� �˶� ���߱�"�̴�.
�� ����� �ܼ��ϴ�. ���� �������ִ� �˶��� 45�� �ռ��� �ð����� �ٲٴ� ���̴�. ������ �˶� �Ҹ��� ������, �˶��� ���� ���� �� �� ���̱� �����̴�. �� ����� ����ϸ�, ���� ��ħ �� ��ٴ� ����� ���� �� �ְ�, �б��� �������� �ʰ� �ȴ�.
���� ����̰� ����� �˶� �ð��� �־����� ��, â������ ����� ����Ѵٸ�, �̸� ������ ���ľ� �ϴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

import java.util.Scanner;

public class P2884 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		int m = scan.nextInt();
		int mMod;
		int hMod;

		if (h == 0) {
			hMod = (h - 1) + 24;
			mMod = (60 - 45) + m;
			System.out.println(hMod + " " + mMod);
		} else if (m < 45) {
			hMod = h - 1;
			mMod = (60 - 45) + m;
			System.out.println(hMod + " " + mMod);
		} else if (m != 45) {
			mMod = m - 45;
			System.out.println(h + " " + mMod);
		} else if (m == 45) {
			System.out.println(h);
		}

		scan.close();
	}
}