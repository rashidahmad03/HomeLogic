package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class apendarray {

	public static void main(String...z) {
		
		apendarray s=	new apendarray();
		int arr[]=new int[2];
		arr[0]=5;
		arr[1]=562;
		System.out.println(Arrays.toString(arr));
		
		//s.appendToNew(arr, 4);
		System.out.println((s.copyArray(arr).length));
				
	}
	
	
	
	
	int[] copyArray(int[] array) {

		int[] copy = new int[0];
		for (int value : array) {
			copy = appendToNew(copy, value);
		}
		return copy;
	}

	int[] appendToNew(int[] array, int value) {
		int[] bigger = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			bigger[i] = array[i];
		}
		bigger[bigger.length - 1] = value;
		return bigger;
	}
	
static int migratoryBirds(List<Integer> arr) {
     Collections.sort(arr);
     int arrs[]=new int[arr.get(arr.size())];
    for(int i:arr)
    {
    	arrs[i]++;
    }
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arrs.length;i++)
    {	
    if(arrs[i]>max)
    	max=arrs[i];
    }
 
return max;
    }

}
