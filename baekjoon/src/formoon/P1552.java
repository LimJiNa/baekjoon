package formoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1552 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line1 = in.readLine();
		int line1Int = Integer.parseInt(line1);

		String line2 = null;
		String[] line2Split = null;
		int line2Int1 = 0;
		int line2Int2 = 0;
		int result = 0;
		StringBuilder print = new StringBuilder();

		for (int i = 0; i < line1Int; i++) {
			line2 = in.readLine();
			line2Split = line2.split(" ");
			line2Int1 = Integer.parseInt(line2Split[0]);
			line2Int2 = Integer.parseInt(line2Split[1]);
			result = (line2Int1 + line2Int2);
			print.append(result + "\n");
		}
		in.close();

		System.out.println(print.toString());
	}
}
