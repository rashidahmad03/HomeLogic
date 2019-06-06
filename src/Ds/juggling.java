package Ds;

public class juggling {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int size = arr.length;
		int D = 6;
		int gcd = gcd(size, D);
		for (int i = 0; i < gcd; i++) {
			int temp = arr[i];
			int j = i;
			while (true) {
				int K = j + D;
				if (K >= size) {
					K = K - size;
				}
				if (K == i)
					break;
				arr[j] = arr[K];
				j = K;

			}
			arr[j] = temp;
		}
		for (int h : arr)
			System.out.println(h);
	}

	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}
		return gcd(y, x % y);

	}

}
