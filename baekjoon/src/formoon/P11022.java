package formoon;

import java.util.Scanner;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.

public class P11022 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int C = 0;

		for (int i = 1; i <= T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			C = A + B;
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + C);
		}
		scan.close();
	}
}
