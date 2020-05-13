package formoon;

//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

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
