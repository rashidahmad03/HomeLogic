package com.sorting;

import com.utilitydata.Dataset;

public class Selectionsort
{
    public static void main(String[] args) {
        Dataset ds=new Dataset();
        int[] a = ds.int_array();
        System.out.println("array of unsorted");
        for(int c:a)
            System.out.print( c+"  ");
        selectionsort(a);
    }
   private static void selectionsort(int[] a){

       int  n= a.length;

       for(int i = 0;i<n;i++){
       /* set current element as minimum*/
      int min = i;

       /* check the element to be minimum */

       for( int j = i+1;j< n;j++) {
           if (a[j] < a[min])
               min = j;
       }

       /* swap the minimum element with the current element*/
       if (min != i )
       a[min] = a[i];

           }

       for(int c:a)
           System.out.print( c+"  +++");

}

}
