package ifmoon;

//세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

import java.util.Scanner;

public class P10817 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[3];
		int result = 0;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					result = nums[j];
					nums[j] = nums[i];
					nums[i] = result;
				}
			}
		}
		System.out.println(nums[1]);

		scan.close();
	}
}