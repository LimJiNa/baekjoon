package string;

import java.util.Scanner;

public class P10809 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] alphabet = new char[26];
		int[] minusNumber = new int[26];

		for (int i = 0; i < minusNumber.length; i++) {
			minusNumber[i] = -1;
		}

		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) (i + 97);
		}

		String word = scan.next();
		String[] splitWord = word.split("");
		for (int i = 0; i < splitWord.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (String.valueOf(alphabet[j]).equals(splitWord[i])) {
					if (minusNumber[j] < 0) {
						minusNumber[j] = i;
					}
				}
			}
		}
		for (int i = 0; i < minusNumber.length; i++) {
			System.out.print(minusNumber[i] + " ");
		}
		scan.close();
	}
}
