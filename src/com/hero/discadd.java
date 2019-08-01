package com.hero;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class discadd {
public static void main(String...s) {
	String n="nermata";
	ArrayList<String> ls=new ArrayList();
	for(int i=0;i<n.length()-2;i++)
		
	{
		ls.add(n.substring(i,i+3));
		
	}
	Collections.sort(ls);
	System.out.println(ls);
	BigInteger bi=new BigInteger("3");
	System.out.println(bi.isProbablePrime(1));
	if(new BigInteger("1").isProbablePrime(5))
		System.out.println(5);
}
}
