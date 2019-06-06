package com.quz;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QUADRATIC {
	public static void main(String...a) {
		List<String> words = Arrays.asList("Life", "is", "beautiful");
	String uniqueChars =  words.toString().toUpperCase();	
System.out.println(uniqueChars);


	Stream.of("life","is","beautiful").map(String::toUpperCase).forEach(System.out::println);

	}
	
	
}
