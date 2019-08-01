package com.interview;

public class isprimenum {

	public static void main(String[] args) {
		System.out.println(isPrime(5));
	}

	static boolean isPrime(int n) {
		for (int x = 2; x <= (int) Math.sqrt(n); x++) {
			if (n % x == 0) {
				return false;
			}
		}
		return true;
	}

}
