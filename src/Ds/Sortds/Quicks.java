package Ds.Sortds;

import com.utilitydata.Dataset;

public class Quicks {

	public static void main(String[] args) {

		Dataset ds = new Dataset();
		int arr[] = ds.int_array();

		int s = 0, e = arr.length - 1;
		for (int a : arr)
			System.out.print(a + " ");
		quicksort(arr, s, e);
		System.out.println(" ");
		for (int a : arr)
			System.out.print(a + " ");

	}

	static void quicksort(int aa[], int start, int end) {
		if (start < end) {
			int i = divid(aa, start, end);
			quicksort(aa, start, i - 1);
			quicksort(aa, i + 1, end);
		}
	}

	static int divid(int aa[], int start, int end) {
		int pivot = aa[end];
		int p = start - 1;

		for (int i = start; i < end; i++) {
			if (aa[i] <= pivot) {
				p++;
				int temp = aa[p];
				aa[p] = aa[i];
				aa[i] = temp;

			}
		}
		int temp = aa[p + 1];
		aa[p + 1] = aa[end];
		aa[end] = temp;

//		while (q >= p) {
//			if (p <= aa.length - 1)
//				while (aa[p] < pivot) {
//
//					p++;
//					if (p >= aa.length - 1)
//						break;
//				}
//
//			while (aa[q] > pivot) {
//				q--;
//				if (q < 0)
//					break;
//			}
//			if (q > p) {
//				int temp = aa[p];
//				aa[q] = aa[p];
//				aa[p] = temp;
//			}
//
//		}
//		while (q >= p) {
//			aa[start] = aa[q];
//			aa[q] = pivot;
//			// return q;
//		}
		return p + 1;

	}

}
