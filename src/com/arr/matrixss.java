package com.arr;

public class matrixss {
	public static void main(String... a) {

		int assa[][] = new int[5][5];
		for (int i = 0; i < assa.length; i++)

			for (int j = 0; j < assa[i].length; j++)
				assa[i][j] = Integer.MIN_VALUE;
		System.out.println("****************###########################***************************");
		for (int i = 0; i < assa.length; i++)
			System.out.println(assa[i][i]);
	}

}
