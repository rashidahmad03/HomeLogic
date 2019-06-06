package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharSum {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String Data=bf.readLine();
		int sum=0;
		for(int i=0;i<Data.length();i++)
		{
			sum+=((Data.charAt(i)%'a')+1);
		
		}
		System.out.println(sum);
	}

}
