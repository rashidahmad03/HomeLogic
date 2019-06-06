package com.sorting;

import com.utilitydata.Dataset;

public class Insertionsort {
    public static void main(String[] args) {
        Discription();
        Dataset ds=new Dataset();


        int[] a = ds.int_array();
        for(int hs:a)
            System.err.print(hs+" ");

        System.out.println("\n after sort");
        insertionsort(a);

    }
    private static void insertionsort(int[] a){
        int holePosition;
        int valueToInsert;

        for(int i = 0;i<a.length;i++) {



            /* select value to be inserted */
            valueToInsert = a[i];
            holePosition = i;

            /*locate hole position for the element to be inserted */

            while( holePosition > 0 && a[ holePosition - 1] >valueToInsert ){
                a[holePosition] = a[holePosition - 1];
                holePosition = holePosition - 1;
            }

            /* insert the number at hole position */
            a[holePosition] = valueToInsert;

        }
        for(int c:a)
        System.out.print(c+"  ");
    }

    private static void Discription(){
        String dc="Step 1 − If it is the first element, it is already sorted. return 1;\n" +
                "Step 2 − Pick next element\n" +
                "Step 3 − Compare with all elements in the sorted sub-list\n" +
                "Step 4 − Shift all the elements in the sorted sub-list that is greater than the \n" +
                "         value to be sorted\n" +
                "Step 5 − Insert the value\n" +
                "Step 6 − Repeat until list is sorted\n" +
                "Pseudocode\n" +
                "procedure insertionSort( A : array of items )\n" +
                "   int holePosition\n" +
                "   int valueToInsert\n" +
                "\t\n" +
                "   for i = 1 to length(A) inclusive do:\n" +
                "\t\n" +
                "      /* select value to be inserted */\n" +
                "      valueToInsert = A[i]\n" +
                "      holePosition = i\n" +
                "      \n" +
                "      /*locate hole position for the element to be inserted */\n" +
                "\t\t\n" +
                "      while holePosition > 0 and A[holePosition-1] > valueToInsert do:\n" +
                "         A[holePosition] = A[holePosition-1]\n" +
                "         holePosition = holePosition -1\n" +
                "      end while\n" +
                "\t\t\n" +
                "      /* insert the number at hole position */\n" +
                "      A[holePosition] = valueToInsert\n" +
                "      \n" +
                "   end for\n" +
                "\t\n" +
                "end procedure" +
                "\n ------*************************************************---------------*****************************---------------************";
        String tm="This algorithm is not suitable for large data sets as its average and worst case complexity are of Ο(n2), where n is the number of items.";
        System.out.println(dc);
        System.out.println(tm);


    }

}
