package com.rashid;

public class Matrixmultiplacation {
	public static void main(String[] args) {
		System.out.println("multipication");
		int[][] yy = new int[][] { { 1, 2 }, { 2, 5 } };
		int[][] zz = yy;
		for (int[] x : yy) {
			for (int c : x) {
				System.out.print(c + "  ");
			}
			System.out.println();
		}
		System.out.println("**************************");
		for (int[] x : zz) {
			for (int c : x) {
				System.out.print(c + "  ");
			}
			System.out.println();
		}
		multi(zz, yy);
	}

	private static void multi(int[][] xx, int[][] yy) {
		int r[][] = new int[2][2]; // any possibility to reduce complexity
		System.out.println("&&&&&&&&&&&&&&###########################&&&&&&&&&&&");
		for (int i = 0; i < xx.length; i++) {
			for (int j = 0; j < xx[i].length; j++) {
				int sum = 0;
				for (int k = 0; k < xx.length; k++) {
					sum += xx[i][k] * yy[k][j];
				}
				r[i][j] = sum;
			}
		}

		System.out.println("**************************");
		for (int[] x : r) {
			for (int c : x) {
				System.out.print(c + "  ");
			}
			System.out.println();
		}
	}

}
