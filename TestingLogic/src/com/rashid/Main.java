package com.rashid;

import com.utilitydata.Dataset;

public class Main {

    public static void main(String[] args) {

        System.out.println("hello im Dekhos");
        Dataset da=new Dataset();
        int[][] v = da.int2D_array();
       for(int[] x :v) {
           for (int cx : x) {
               System.out.print(cx + " ");
           }
           System.out.println();
       }

    }
}
