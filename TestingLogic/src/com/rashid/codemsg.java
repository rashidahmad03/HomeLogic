package com.rashid;


import java.util.Scanner;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;
 public class codemsg{
    public static void main(String...hrt){
    	int n=0;
        try{ n=new Scanner(System.in).nextInt();}
        catch(Exception e){ makHrt(9);
            print("see what to input from comments in code");
          //  System.exit(0);
            }
        makHrt(n%2==0?++n:n);
        }
    private static void makHrt(int n){
        IntStream.rangeClosed(-n,n).forEach(i->IntStream.rangeClosed(-n,n).forEach(j->print((((j-i+n>0&&j+i-n<0&&i>=0)||((i*i+(j-n/2)*(j-n/2)<=n*n/4||i*i+(j+n/2)*(j+n/2)<=n*n/4)&&i<=0))?"\uD83D\uDC99":"  ")+(j==n?"\n":""))));}
    private static void print(String c){
        try{ OutputStreamWriter in=new OutputStreamWriter(System.out, StandardCharsets.UTF_16); in.write(c); in.flush();} //in.close();
        catch(IOException ignored){}
        }
}