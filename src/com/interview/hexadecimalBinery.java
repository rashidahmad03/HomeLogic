package com.interview;

public class hexadecimalBinery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hexadecimalBinery a=new hexadecimalBinery();
		System.out.println(a.compareBinToHex("10", "A"));
	}
	boolean compareBinToHex(String binary, String hex) { 
		 int n1 =convertFromBase(binary, 2);
		// System.out.println(n1);
		 int n2 = convertFromBase(hex, 16);
		 System.out.println(n2);
		 if (n1 < 0  || n2 < 0) { 
			  return false;
			  } 
		 return n1 == n2;
		 } 
	int convertFromBase(String number, int base) { 
		if (base< 2 || (base> 10 && base!= 16)) 
			return -1; 
		int value = 0; 
		for (int i= number.length() - 1; i >= 0; i--) { 
			 int digit = digitToValue(number.charAt(i)); 
			 if (digit< 0 || digit>= base) { 
				 return -1; 
				 } 
			 int exp= number.length() - 1 - i;
			 value += digit * Math.pow(base, exp); 
			 } 
		return value; 
		} 
	int digitToValue(char c) {
		return c;
	} 

}
