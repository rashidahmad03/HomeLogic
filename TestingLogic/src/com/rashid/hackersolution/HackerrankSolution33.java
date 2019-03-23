package com.rashid.hackersolution;   
import java.io.*;
import java.util.*;

public class HackerrankSolution33 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String r="";
         for(int i = A.length() - 1; i >= 0; i--)
        {
            r = r + A.charAt(i);
        }
       // System.out.println(r); 
        
        if(A.equals(r))
            System.out.println("Yes");
        /* Enter your code here. Print output to STDOUT. */
        else
            System.out.println("No");
    }
}
