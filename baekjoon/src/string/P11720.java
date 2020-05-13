package string;

import java.util.Scanner;

public class P11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr = scan.nextInt();
		String[] num = new String[arr];
		int result = 0;

		String nums = scan.next();
		for (int i = 0; i < num.length; i++) {
			String[] splitNums = nums.split("");
			num[i] = splitNums[i];
			int intSplitNums = Integer.parseInt(num[i]);
			result += intSplitNums;
		}
		System.out.println(result);
		scan.close();
	}
}
