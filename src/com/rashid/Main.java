package com.rashid;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String... s) throws IOException {
		Scanner ss = new Scanner(System.in);

		int t = ss.nextInt();
		double as = ss.nextDouble();
		int df = (int) as;
		if (t > 0 && t <= 2000 && df > 0 && df <= 2000 && t - 0.5 < df) {
			if (t % 5 == 0) {
				if (t > 0 && t <= 2000)
					System.out.printf("%.2f", as - t - 0.50);

			}

			else {
				System.out.println(as);
			}
		} else {
			System.out.println(as);
		}

		ss.close();
	}

}
