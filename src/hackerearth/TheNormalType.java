package hackerearth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TheNormalType {
    public static void main(String args[] ) throws Exception {
        FileReader fl=new FileReader("C:/Users/rashi/Downloads/c9ced93c20-input-c9cda1f.txt.clean.txt");
       
        BufferedReader br = new BufferedReader(fl);
        String name = br.readLine();                // Reading input from STDIN
      String data = br.readLine();
      String vt[]=data.split(" ");
            
 String K = br.readLine();
 int k=Integer.parseInt(K);
 
//System.out.println(k);
int arr[]=new int[100001];
int arr1[]=new int[100001];
     for(int i=0;i<vt.length;i++)
     arr[i]=(Integer.parseInt(vt[i]));
      for(int i=0;i<100001;i++)
    arr1[arr[i]]++;
    int sum=0;
     for(int i=0;i<100001;i++) {
    	 System.out.println(arr[i]);
    	 if(arr1[i]==k && arr1[0]!=1)
    	  {
    	    sum=i;
    	    break;
    	  }
    	
     }
 
  System.out.println(sum);
	}
	

}




/*
 * 
 * 
 * 
 *There are a lot of Poke'mons who are jealous of the fact that they do NOT have any specialty, they're the... normal type of Poke'mon. But, what they fail to realize is that their power is their normalcy, the ability to think, rationalize and then act.

But, they do have an additional power... Poke'mons like Jigglypuff - which are normal, can figure out if a trainer is real or is a part of Team Rocket. And they need to use their power to a great extent.

In an array, which consists of N elements, A1, A2, ..., AN, if a subarray has the total number of distinct elements as that of the original array, that determines the presence of Team Rocket.

You've to help the normal type Poke'mons in figuring out the total number of subarrays having total number of distinct elements same as that of the original array.

Input format:
The first line of the input will consist of a single integer N. The next line will consist of N integers A1, A2, ... , AN.

Output format: Output the answer to the problem.

Constraints:
1 ≤ N ≤ 2 * 105
1 ≤ Ai ≤ 109

Reference:
enter image description here

SAMPLE INPUT 
5
1 2 2 1 1 
SAMPLE OUTPUT 
8 
 * 
 * */
 