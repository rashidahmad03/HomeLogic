package com.sorting;
/*
* Worst Case Time Complexity [ Big-O ]: O(n2)
Best Case Time Complexity [Big-omega]: O(n)
Average Time Complexity [Big-theta]: O(n2)
Space Complexity: O(1)
*
* */
import com.utilitydata.Dataset;

public class BubbleInt {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.println(version);
        System.out.println("User Name                      : " + System.getProperty("user.name"));
        System.out.println("User Home Directory            : " + System.getProperty("user.home"));
        System.out.println("User Present Working Directory : " + System.getProperty("user.dir") + "\n");

        System.out.println("Java Version                   : " + System.getProperty("java.version"));
        System.out.println("Java Vendor                    : " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL                : " + System.getProperty("java.vendor.url"));
        System.out.println("Java Installed Directory       : " + System.getProperty("java.home") + "\n");

        System.out.println("JRE Specification Version      : " + System.getProperty("java.specification.version"));
        System.out.println("JRE Specification Vendor       : " + System.getProperty("java.specification.vendor"));
        System.out.println("JRE Specification Name         : " + System.getProperty("java.specification.name"));
        System.out.println("JVM Implementation Version     : " + System.getProperty("java.vm.version"));
        System.out.println("JVM Implementation Vendor      : " + System.getProperty("java.vm.vendor"));
        System.out.println("JVM Implementation Name        : " + System.getProperty("java.vm.name") + "\n");

        System.out.println("Class Format Version           : " + System.getProperty("java.class.version"));
        System.out.println("Class Path                     : " + System.getProperty("java.class.path"));
        System.out.println("Library Path                   : " + System.getProperty("java.library.path"));
        System.out.println("Temporary File Path            : " + System.getProperty("java.io.tmpdir"));
        System.out.println("Extension Directories Path     : " + System.getProperty("java.ext.dirs") + "\n");

        System.out.println("OS Name                        : " + System.getProperty("os.name"));
        System.out.println("OS Architecture                : " + System.getProperty("os.arch"));
        System.out.println("OS Version                     : " + System.getProperty("os.version"));
        System.out.println("File Separator                 : " + System.getProperty("file.separator"));
        System.out.println("Path Separator                 : " + System.getProperty("path.separator"));
        System.out.println("Line Separator                 : " + System.getProperty("line.separator"));
        int[] a = new Dataset().int_array();

        bubbleSort(a,a.length);
    }
  private static  void bubbleSort(int[] arr, int n)
    {
        boolean flag=false ;
        int i, j, temp;
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n-i-1; j++)
            {
                // introducing a flag to monitor swapping
               flag = false;
                if( arr[j] > arr[j+1])
                {
                    // swap the elements
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    // if swapping happens update flag to 1
                    flag = true;
                }
            }
            // if value of flag is zero after all the iterations of inner loop
            // then break out
            if(!flag)
            {
                break;
            }
        }

        // print the sorted array
        System.out.print("Sorted Array: ");
        for(i = 0; i < n; i++)
        {
            System.out.printf("%d  ", arr[i]);
        }
    }
}
