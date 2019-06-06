package com.quz;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class filedetailse {

	public static void main(String... as) {
		FileReader fr = null;
		try {
			fr = new FileReader("output.txt");

			System.out.println("dfdf " + fr.toString());

		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		}
	}

}
