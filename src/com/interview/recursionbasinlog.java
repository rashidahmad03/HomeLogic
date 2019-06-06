package com.interview;

public class recursionbasinlog {

	public static void main(String[] args) {
		recursionbasinlog ts=new recursionbasinlog();
		System.out.println(ts.f(4));

	}

	int f(int n) {

		if (n <= 1) {
			return 1;
		}
		return f(n - 1) + f(n - 1);
	}

}
