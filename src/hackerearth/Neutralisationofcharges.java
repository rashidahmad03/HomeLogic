package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Neutralisationofcharges {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
ArrayList<Integer> ls=new ArrayList();
ls.add(5);
ls.add(2);
int arr[]=new int[ls.size()];

		String s=new String(bf.readLine());
		String out=new String(bf.readLine());
		for(char i='a'; i<='z';i++) {
			out=out.replaceAll(""+i+i, "");
			//System.out.println(""+i+i);
		}
		System.out.println(out);
	}

}
