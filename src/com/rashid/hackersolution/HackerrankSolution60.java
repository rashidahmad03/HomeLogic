package com.rashid.hackersolution;   
import java.io.*;
import java.util.*;
public class HackerrankSolution60 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
         StringTokenizer st1 =new StringTokenizer(s,"\\,\\'\\ \\?\\!\\#\\*\\;\\.");
 System.out.println(st1.countTokens());
        while (st1.hasMoreTokens()){
           
            System.out.println(st1.nextToken());
        }
        
        // Write your code here.
        scan.close();
    }
}
