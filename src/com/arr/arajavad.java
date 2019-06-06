package com.arr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class arajavad {
	static int a[] = null;
	static int size = 1;

	public static void main(String... f) throws NumberFormatException, IOException {

		File file = new File("C:\\Users\\ahmadra\\Desktop\\test.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null)
			insert(Integer.parseInt(st));

		printall();
		// System.out.println(a.length);
	}

	public static void insert(int s) {

		if (a != null) {
			int[] b = a.clone();

			a = new int[size];
			// a = b.clone();
			for (int i = 0; i < b.length; i++)
				a[i] = b[i];
			// a = b.clone();
			a[size - 1] = s;

			size++;
		} else {
			a = new int[size];
			// a = b.clone();

			a[size - 1] = s;

			size++;
		}
	}

	public static void printall() {
		for (int g : a) {
			System.out.print(g + "  ");
		}
	}

}
