package com.utilitydata;

import java.util.Random;

public class Dataset {
    public int[] int_array(){
        return new int[]{8, 7, 9, 1, 2, 4, 3, 6, 5, 0};
    }
    public int[] int_array_sort(){
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public int[][] int2D_array(){
        int[][] arr = new int[10][10];
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
                arr[i][j] =new Random().nextInt(100);

        return arr;
    }
  
   
    public Integer[] Integer_array(){
        return new Integer[]{8, 7, 9, 1, 2, 4, 3, 6, 5, 0};
    }
    public Integer[] Integer_array_sort(){
        return new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }
    public String[] String_array(){
        return new String[]{"hi", "5", "see", "edf", "hello", "bye", "world", "sakti", "maan", "dunia"};
    }
    public String[] String_array_sort(){
        return new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    }
    public char[] char_array(){
        return new char[]{'d', 'c', 'a', 'e', 'q', 'j', 'b', 'm', 'p', 'z'};
    }
    public char[] char_array_sort(){
        return new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
    }
    public float[] float_array(){
        return new float[]{8.5f, 8.4f, 4.5f, 1.2f, 5.1f, 3.2f, 2.5f, 6f, 5f, 0.2f};
    }
    public float[] float_array_sort(){
        return new float[]{0.0f, 1.0f, 2.2f, 3.0f, 4.5f, 5.6f, 6.5f, 7.2f, 8f, 9f};
    }
 
    public int[][] int2D_array_sort(){
        int[][] arr = new int[10][10];
        int x=0;
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
                arr[i][j]=x++;
        return arr;
    }


}
