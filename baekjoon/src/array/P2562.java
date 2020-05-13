package array;

import java.util.Scanner;

public class P2562 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nine = new int[9];
		int maxNum = 0;
		int maxNumIndexNum = 0;
		for (int i = 0; i < nine.length; i++) {
			nine[i] = scan.nextInt();
		}
		for (int i = 0; i < nine.length; i++) {
			if (maxNum > nine[i]) {
				continue;
			} else {
				maxNum = nine[i];
				if (maxNum == nine[i]) {
					maxNumIndexNum = i + 1;
				}
			}
		}
		System.out.println(maxNum);
		System.out.println(maxNumIndexNum);

		scan.close();
	}
}
