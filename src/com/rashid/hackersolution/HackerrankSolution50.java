package com.rashid.hackersolution;   
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerrankSolution50 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        Locale INDIA = new Locale("en","IN");
    Locale BANGLADESH = new Locale("en","BD");

    NumberFormat us    = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat india  = NumberFormat.getCurrencyInstance(INDIA);
    NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    NumberFormat bangladesh = NumberFormat.getCurrencyInstance(BANGLADESH);
        
        
        // Write your code here.
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
