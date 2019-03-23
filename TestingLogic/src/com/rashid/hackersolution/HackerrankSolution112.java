package com.rashid.hackersolution;   
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerrankSolution112 {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    int mn=arr[0],mx=arr[0];
    int   mna=0,mxa=0;
        for(int i=0;i<arr.length;i++)
        {
            if(mn<arr[i])
                mn=arr[i];
            
            if(arr[i]<mx)
                mx=arr[i];
            
        }
        for(int i=0;i<arr.length;i++)
        {
            if(mn==arr[i])
               continue;
            mna=mna+arr[i];
            
            
        }
           for(int i=0;i<arr.length;i++)
        {
            if(mx==arr[i])
               continue;
            mxa=mxa+arr[i];
            
            
        }
        System.out.println(mna+" "+mxa);
       
        

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
