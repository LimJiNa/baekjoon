import java.util.Scanner;

public class P5565 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] bookPrice = new int[9];
		int bookPriceSum = scan.nextInt();
		for (int i = 0; i < bookPrice.length; i++) {
			bookPrice[i] = scan.nextInt();
		}

		int unPriceBook = 0;
		for (int i = 0; i < bookPrice.length; i++) {
			bookPriceSum -= bookPrice[i];
			unPriceBook = bookPriceSum;
		}
		System.out.println(unPriceBook);
		scan.close();
	}
}
