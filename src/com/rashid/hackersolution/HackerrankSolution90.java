package com.rashid.hackersolution;   
import java.util.Scanner;
import java.util.regex.*;

public class HackerrankSolution90
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
            try{
                Pattern pat=Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(Exception e){System.out.println("Invalid");}
            testCases--;
          	//Write your code
		}
	}
}



