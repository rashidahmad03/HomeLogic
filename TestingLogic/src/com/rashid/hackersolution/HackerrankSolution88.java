package com.rashid.hackersolution;   
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HackerrankSolution88 {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
  
    
       String a[]=s.split(":");
    String r="";
    if(a[2].charAt(2)=='P')
    {
      r=(Integer.parseInt(a[0])+12)+":"+a[1]+":"+a[2].charAt(0)+a[2].charAt(1);
    }
    else if(a[0].equals("12")&&a[2].charAt(2)=='A'){
        r = "00" + ":" + a[1] + ":" + a[2].charAt(0) + a[2].charAt(1);
    }
    else
        r = (a[0]) + ":" + a[1] + ":" + a[2].charAt(0) + a[2].charAt(1);
return r;
    }
    
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
