package array;

import java.util.Arrays;
import java.util.Scanner;

public class P10818 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] nNum = new int[N];
		for (int i = 0; i < nNum.length; i++) {
			nNum[i] = scan.nextInt();
		}
		Arrays.sort(nNum);
		System.out.println(nNum[0] + " " + nNum[nNum.length - 1]);

		scan.close();
	}
}
