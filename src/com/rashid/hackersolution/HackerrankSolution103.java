package com.rashid.hackersolution;   
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerrankSolution103 {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int n=0,p=0,z=0;
        int s=arr.length;
        for(int i=0;i<s;i++)
        {
            if(arr[i]>0)
            {  n++;}
             if(arr[i]<0)
             {  p++;}
             if(arr[i]==0)
             {  z++;}
                
        }
        float a=(float)n/s;
          float a1=(float)p/s;
          float a2=(float)z/s;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        
                
                        
        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
