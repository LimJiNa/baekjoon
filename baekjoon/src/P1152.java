import java.util.Scanner;

public class P1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String typing = scan.nextLine();
		scan.close();

		int count = 0;
		String[] splitTyping = typing.split(" ");

		for (int i = 0; i < splitTyping.length; i++) {
			if (splitTyping[i].equals("")) {
				System.out.println("�����մϴ�.");
			} else {
				count++;
			}
		}
		System.out.println(count);
	}
}
