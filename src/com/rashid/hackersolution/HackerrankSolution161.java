package com.rashid.hackersolution;   



//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class HackerrankSolution161{
	public static void main(String []argh)
	{
     HashMap <String,Integer> hp=new HashMap <String,Integer>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();

            hp.put(name,phone);

		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(hp.containsKey(s))
            System.out.println(s+"="+hp.get(s));
            else
            System.out.println("Not found");

		}
       
	}
}



