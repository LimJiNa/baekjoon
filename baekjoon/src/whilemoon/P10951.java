package whilemoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReaderIn = new BufferedReader(new InputStreamReader(System.in));
		String ab = null;
		int hap = 0;
		String print = "";

		while ((ab = bufferedReaderIn.readLine()) != null) {
			String[] abSplit = ab.split(" ");
			int aInt = Integer.parseInt(abSplit[0]);
			int bInt = Integer.parseInt(abSplit[1]);
			hap = aInt + bInt;
			print += hap + "\n";
		}
		System.out.println(print);
		
		bufferedReaderIn.close();
	}
}
