package array;

import java.util.Scanner;

public class P1546 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] score = new int[n];
		int totalScore = 0;
		double max = 0;
		double avg = 0;

		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
			if (max < score[i]) {
				max = score[i];
			}
			totalScore += score[i];
		}
		avg = ((totalScore / max) * 100) / n;
		System.out.println(avg);
		
		scan.close();
	}
}
