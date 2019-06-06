package com.rashid.hackersolution;   
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerrankSolution55 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        leftRotate(a, n, k);
        
    }
         static void leftRotate(int arr[], int n,
                                     int k)
    {
        /* To get the starting point of 
        rotated array */
        int mod = k % n;
     
        // Prints the rotated array from 
        // start position
        for(int i = 0; i < n; ++i)
        System.out.print(arr[(i + mod) % n]
                          + " "); 
         
        System.out.println();
    }
    
}
