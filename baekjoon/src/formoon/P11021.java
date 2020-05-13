package formoon;

import java.util.Scanner;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.

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
