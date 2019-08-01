package com.interview;

public class Minimumandmaximumelementinanintegerarray {

	public static void main(String[] args) {
		int arr[] = { 5, 35, 3, 21, 89, 2, 1 };
		new Minimumandmaximumelementinanintegerarray().swapMinMax(arr);
		for (int x : arr)
			System.out.println(x);
	}

	void swapMinMax(int[] array) {
		int minindex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[minindex]) {
				minindex = i;
			}
		}

		int maxindex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[maxindex]) {
				maxindex = i;
			}
		}
		int temp = array[minindex];
		array[minindex] = array[maxindex];
		array[maxindex] = temp;
	}

}
