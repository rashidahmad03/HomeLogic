package com.rashid.hackersolution;   
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerrankSolution151 {

    // Complete the twoStrings function below.



    static String twoStrings(String s1, String s2) {
       // char t1[] = s1.toCharArray();
      
        // sort tempArray
       // Arrays.sort(t1);
        
        
       
        String da="NO";



        for(int i=0;i<s2.length();i++)
        {
            
                if(s1.indexOf(s2.charAt(i))!=-1)
                {
                    da="YES";
                    break;
            }
            

        }
        return da;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
