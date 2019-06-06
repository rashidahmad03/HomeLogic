package com.pattern;

import java.util.Scanner;

public class dimond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int d = 0;
			for (int j = 0; j < n * 2; j++) {
				if (i + j >= n - 1 && i + n > j) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
