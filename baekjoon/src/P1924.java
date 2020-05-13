import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class P1924 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = 2007;
		int month = scan.nextInt();
		int day = scan.nextInt();
		scan.close();

		LocalDate localdate = LocalDate.of(year, month, day);
		DayOfWeek week = localdate.getDayOfWeek();

		String result = String.valueOf(week);
		System.out.println(result.substring(0, 3));
	}
}
