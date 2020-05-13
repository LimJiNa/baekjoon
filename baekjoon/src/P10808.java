import java.util.Scanner;

public class P10808 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] alphabet = new char[26];
		int[] zeroNumbers = new int[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) (i + 97);
			zeroNumbers[i] = 0;
		}

		String inputWord = scan.next();
		String[] splitWord = inputWord.split("");
		for (int i = 0; i < splitWord.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (splitWord[i].equals(String.valueOf(alphabet[j]))) {
					if (zeroNumbers[j] > 0) {
						zeroNumbers[j] += 1;
					} else {
						zeroNumbers[j] = 1;
					}
				}
			}
		}

		for (int i = 0; i < zeroNumbers.length; i++) {
			System.out.print(zeroNumbers[i] + " ");
		}
		scan.close();
	}
}
