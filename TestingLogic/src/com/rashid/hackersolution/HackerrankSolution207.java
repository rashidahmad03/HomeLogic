package com.rashid.hackersolution;   
import java.io.*;
import java.util.*;

public class HackerrankSolution207 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named HackerrankSolution207. */

      Scanner sc = new Scanner(System.in);

        int cd = sc.nextInt();
        int cm = sc.nextInt();
        int cy = sc.nextInt();
        int ed = sc.nextInt();
        int em = sc.nextInt();
        int ey = sc.nextInt();
        int fine = 0;
      if (cy >= ey) {

            if (cm >= em && cy == ey) {

                if (cd >= ed && cm == em && cy == ey) {
                    fine = (15) * (cd - ed);
                    System.out.println(fine);
                } else {

                    fine = (500) * (cm - em);
                    System.out.println(fine);
                }

            } else {
                if (cd <= ed && cm <= em && cy <= ey)
                    System.out.println(fine);
                else {
                    fine = (10000);
                    System.out.println(fine);
                }
            }

        } else {
            System.out.println(0);
        }

    }
}

