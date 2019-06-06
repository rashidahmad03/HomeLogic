package com.rashid;

import java.util.*;
import java.util.stream.Collectors;

public class UNICHAR {

	
public static	List<Character> ls=new ArrayList<Character>();
	
	public static void main(String[] args) {
		
		String[] a={"Life", "is", "beautiful" };
		
		for(String s:a)
			see(s);
		System.out.println(ls);
		System.out.println("\n");
		java8();
	}
	
	static void see(String aa) { 
		for(int i=0;i<aa.length();i++)
		{
			if(!ls.contains(aa.charAt(i))) {
				ls.add(aa.charAt(i));
			}
		}
	}
	
	
	
	
	public static void java8() {
		List<String> words = Arrays.asList("Life", "is", "beautiful");
		List<String> uniqueChars = words.stream().map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
		uniqueChars.forEach(System.out::print); 
	}
	
}
