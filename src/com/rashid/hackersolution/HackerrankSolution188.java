package com.rashid.hackersolution;   
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerrankSolution188 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String d="";
        while(n!=0){
            int r=n%2;
            d+=String.valueOf(r);
            n=n/2;
        }
        int c=0,f=0;
        for(int i=0;i<d.length();i++)
        {
            if(d.charAt(i)=='1')
            {f++;
            if(f>c)
                c++;
            }
           else f=0;
           

        }
        System.out.println(c);

        scanner.close();
    }
}
