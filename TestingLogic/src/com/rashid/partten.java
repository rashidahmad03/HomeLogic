package com.rashid;

import java.util.Scanner;

public class partten {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int c = 0;

		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t * 2; j++) {
				if (i + j >= t && i + t >= j) {
					if (j > t) {
						c--;
						System.out.print(c);
					} else {
						c++;
						System.out.print(c);
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
