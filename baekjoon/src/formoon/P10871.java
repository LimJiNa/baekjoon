package formoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
//이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

public class P10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		String X = br.readLine();

		String[] nSplit = N.split(" ");
		int ns1 = Integer.parseInt(nSplit[0]);
		int[] nb1 = new int[ns1];

		String[] xSplit = X.split(" ");
		for (int i = 0; i < nb1.length; i++) {
			nb1[i] = Integer.parseInt(xSplit[i]);
		}

		int ns2 = Integer.parseInt(nSplit[1]);

		String print="";
		for(int i=0; i<nb1.length; i++) {
			if(nb1[i]<ns2) {
				print+=nb1[i]+" ";
			}
		}
		System.out.println(print.substring(0,print.length()-1));
	}
}
