package com.interview;

import java.util.HashSet;
import java.util.Set;

public class print1000toabcdsquare {

	public static void main(String[] args) {

		abcd(5);
		// abcdn2(5);

	}

	public static void abcd(int n) {
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				for (int c = 1; c <= n; c++) {
					int lhs = a * a + b * b;
					int d = (int) Math.sqrt(lhs - c * c);
					if (a * a + b * b == c * c + d * d)
						System.out.println(a + " " + b + " " + c + " " + d);

				}
			}
		}
	}

	public static void abcdn2(int n) {
		HashSet<String> set = new HashSet();
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				set.add((a + "" + b));
			}

		}
		for (int c = 1; c <= n; c++) {
			for (int d = 1; d <= n; d++) {
				if (set.contains(c + "" + d))
					System.out.println((c + " " + d) + " " + (c + " " + d));
			}

		}
	}

}
