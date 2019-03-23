package com.searching;

import com.utilitydata.Dataset;
import java.util.Arrays;
/*
*Worst case performance: O(log n)
*Best case performance: O(1)
*
* T(n) = T(n/2) + c
*
*
* Compare x with the middle element.
If x matches with middle element, we return the mid index.
Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
Else (x is smaller) recur for the left half.
*
*
* */
@SuppressWarnings("ALL")
public class Binearysearch {
    public static void main(String[] args) {

        Dataset da=new Dataset();
        binarySearchDocument();
        int[] v = da.int_array_sort();
        int key = 5;
        int last=v.length-1;
        System.out.println("BinarySearch linear");
        BinarySearch(v,0,last,key);



        System.out.println("binarySearch Arrays.binarySearch()");
        int result = Arrays.binarySearch(v,key);
        if (result < 0)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);



        System.out.println("binarySearch using recursion");
        int resultrecursion = binarySearchRecursion(v,0,last,key);
        if (resultrecursion == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+resultrecursion);


  }
    private static void BinarySearch(int[] arr, int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    private static int binarySearchRecursion(int[] arr, int first, int last, int key){
        if (last>=first){
            int mid = first + (last - first)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binarySearchRecursion(arr, first, mid-1, key);//search in left subarray
            }else{
                return binarySearchRecursion(arr, mid+1, last, key);//search in right subarray
            }
        }
        return -1;
    }
    private static void binarySearchDocument(){
        System.out.println(" /*******************************\n" +
                "*Worst case performance: O(log n)\n" +
                "*Best case performance: O(1)\n" +
                "*\n" +
                "* T(n) = T(n/2) + c\n" +
                "*\n" +
                "*\n" +
                "*\n Algorithm\n" +
                "*\n" +
                "* Compare x with the middle element.\n" +
                "If x matches with middle element, we return the mid index.\n" +
                "Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.\n" +
                "Else (x is smaller) recur for the left half.\n" +
                "*\n" +
                "*\n" +
                "******************************************* */  ");
    }
}
