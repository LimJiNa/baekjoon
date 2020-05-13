package array;

import java.util.Arrays;
import java.util.Scanner;

public class P3052 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] numbers = new int[10];
		int count = 1;

		for (int i = 0; i < numbers.length; i++) {
			int number = scan.nextInt();
			numbers[i] = (number % 42);
		}
		Arrays.sort(numbers);
		for (int i = 0; i < 9; i++) {
			if (numbers[i] != numbers[i + 1]) {
				count++;
			}
		}
		System.out.println(count);

		scan.close();
	}
}
