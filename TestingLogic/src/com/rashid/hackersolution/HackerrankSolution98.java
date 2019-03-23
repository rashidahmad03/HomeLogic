package com.rashid.hackersolution;   
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerrankSolution98 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger d=new BigInteger(n);
        if(d.isProbablePrime(1))
            System.out.println("prime");
        else System.out.println("not prime");
        scanner.close();
    }
}
