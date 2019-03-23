package com.rashid.hackersolution;   
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerrankSolution25 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String ss=S.substring(start,end);
        System.out.println(ss);
    }
}
