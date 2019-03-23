package com.rashid.hackersolution;   
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerrankSolution26 {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int d=s.length();
         List<String> sub = new ArrayList<String>();  
    for(int i=0; i<=(s.length()-k); i++ ){
        sub.add(s.substring(i, k+i));
    }

    Collections.sort(sub);

    System.out.println(sub.get(0));
    System.out.println(sub.get(sub.size()-1));
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
