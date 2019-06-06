package com.interview;

public class print1000toabcdsquare {

	public static void main(String[] args) {
		
int n=10;
for(int a=1;a<n;a++)
{
	for(int b=1;b<n;b++) {
		for(int c=1;c<n;c++) {
			int lhs=a*a+b*b;
			int d=(int) Math.sqrt(lhs-c*c);
				if(a*a+b*b==c*c+d*d)
					System.out.println(a+" "+b+" "+c+" "+d);
				
			
		}
	}
}
	}

}
