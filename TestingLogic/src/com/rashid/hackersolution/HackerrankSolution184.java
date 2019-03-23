package com.rashid.hackersolution;   
import java.io.*;
import java.util.*;

public class HackerrankSolution184 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int ccc=sc.nextInt();

        String aa[]=new String[ccc];
sc.nextLine();
        for(int i=0;i<ccc;i++){
            aa[i]=sc.nextLine();

        }
        
        for(int i=0;i<ccc;i++){
           Stf(aa[i]);

        }


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named HackerrankSolution184. */
    }
    public static void Stf(String a){
        String ev="";
        String od="";
        for(int i=0;i<a.length();i++){
            if(i%2==0)
            ev=ev+a.charAt(i);
            else
            od=od+a.charAt(i);

        }
        System.out.println(ev+" "+od);

    }
}

