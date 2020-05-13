import java.util.Scanner;

public class P10039 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}
		for (int i = 0; i < score.length; i++) {
			if (score[i] < 40) {
				sum += 40;
			} else {
				sum += score[i];
			}
		}
		System.out.println(sum / score.length);
		scan.close();
	}
}
