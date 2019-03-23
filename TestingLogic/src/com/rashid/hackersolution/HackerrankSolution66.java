package com.rashid.hackersolution;   
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HackerrankSolution66 {

    public static void main(String[] args)  throws IOException{
        
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a1= new BigInteger(br.readLine());
        BigInteger b1=new BigInteger(br.readLine());

        System.out.println(b1.add(a1));
        System.out.println(b1.multiply(a1));

        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named HackerrankSolution66. */
    }
}