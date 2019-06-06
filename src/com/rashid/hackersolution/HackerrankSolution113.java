package com.rashid.hackersolution;   
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerrankSolution113 {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    int mn=arr[0],mx=arr[0];
    long   mna=0L;long mxaa=0L;
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
