package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class FredoandArrayUpdate {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(bf.readLine());
		String d=bf.readLine();
		String v[]=d.split(" ");
		int arr[]=new int[T];
		for(int i=0;i<v.length;i++)
			arr[i]=Integer.parseInt(v[i]);
		int sum=0;
		for(int i=0;i<v.length;i++)
			sum+=arr[i];
//		int fact=sum/T;
//		int rs=0;
//		Arrays.parallelSort(arr);
//		for(int i=0;i<v.length;i++)
//			if(fact<=arr[i])
//			{
//				rs=arr[i];
//				break;
//			}
		System.out.println((sum/T)+1);
		
	}
}
