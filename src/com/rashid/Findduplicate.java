package com.rashid;

import java.util.ArrayList;
import java.util.List;

public class Findduplicate {

public static void main(String[] args) 
	{

		int[] a = { 1, 2, 3, 4, 5, 2, 6, 3, 1, 4, 8 };
		List<Integer> ls = new ArrayList<Integer>();
		for (int i : a) 
			ls.add(i);//add all array element to list
		System.out.println(ls);
		Optimize(ls);

	}
	
	
public static void  Optimize(List<Integer> a) //just  to solve by passing list 
	{
		int c=0;
		for (Integer i : a)
		{
			if (a.size() == 0 || !a.contains(i)) 
			{
				c--;
			}
			else 
			{
				c++;
			}
		}
		System.out.println(c);
	}
	
	

}
