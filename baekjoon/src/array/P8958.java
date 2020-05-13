package array;

import java.util.Scanner;

public class P8958 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCaseNumber = scan.nextInt();
		String testCase;
		int count = 0;
		int result = 0;

		for (int i = 0; i < testCaseNumber; i++) {
			testCase = scan.next();
			String[] tc = testCase.split("");
			for (int j = 0; j < tc.length; j++) {
				if (tc[j].equals("O")) {
					count += 1;
					result += count;
				} else if (tc[j].equals("X")) {
					count = 0;
				}
			}
			System.out.println(result);
			count = 0;
			result = 0;
		}
		scan.close();
	}
}
