package com.rashid.hackersolution;   
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerrankSolution135 {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
    int mn=arr[0],mx=arr[1];
    long   mna=0L;long mxaa=0L;
        
        for(int i=0;i<arr.length-1;i++)
        {
            
            mna=mna+arr[i];
            
            
        }
           for(int i=1;i<arr.length;i++)
        {
            
                 mxaa=arr[i]+mxaa;
              
            
            
        }
     System.out.println(mna+" "+mxaa);
       
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
