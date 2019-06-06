package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BricksGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int s = 1;
		int p = 0, m = 0;
		while (T > s) {
			p++;

			m += (p * 2);

			s = p + m;

		}

		if (T - (p + (p * 2)) < p)
			System.out.println("Patlu");
		else
			System.out.println("Motu");

	}

}