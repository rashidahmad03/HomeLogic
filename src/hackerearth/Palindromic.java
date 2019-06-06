package hackerearth;

import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        StringBuffer br=new StringBuffer(ss);
        br.reverse();
        if(ss.equals(String.valueOf(br)))System.out.println("YES");
        else System.out.println("NO");
    }
}
