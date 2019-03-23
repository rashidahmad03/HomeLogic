package com.rashid.hackersolution;   
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HackerrankSolution49 {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
     for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=n;j++)
           {
               if(i+j>n)
			   {System.out.print("#");}
		   else{
			    System.out.print(" ");
           }
		   }
           System.out.println();
       }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
