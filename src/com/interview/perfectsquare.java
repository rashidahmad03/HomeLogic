package com.interview;

public class perfectsquare {

	public static void main(String[] args) {
		perfectsquare pf=new perfectsquare();
		int pfv=pf.sqrt(9);
		System.out.println(pfv);

	}
	int sqrt(int n) {
		return sqrt_helper(n, 1, n); 
		}
	int sqrt_helper(int n, int min, int max) {
		if (max < min) return -1; 
		int guess = (min + max)/2 ;
		if (guess *guess == n) {
			 return guess; } 
		else if (guess * guess < n) 
		{ 
			return sqrt_helper(n, guess + 1, max); 
			
		} else { 
		
			return sqrt_helper(n, min, guess - 1); 
			}
		}
	int sqrt1(int n) { 
		for (int guess = 1; guess * guess <= n; guess++)
		{ 
			if (guess * guess == n) {
				return guess;
			}
		} return -1; 
		}
	

}
