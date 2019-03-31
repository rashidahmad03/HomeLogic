package codechef;

import java.math.BigInteger;
import java.util.Scanner;

public class T21BigMultiplication {



	    
	    public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       BigInteger a,b,c;
	       BigInteger d = new BigInteger("3"); 
	       int i,t;
	       t = sc.nextInt();
	       for(i=1;i<=t;i++)
	       {
	           a = sc.nextBigInteger();
	           b = sc.nextBigInteger();
	           a = a.mod(d);
	           b = b.mod(d);
	           a=a.multiply(b);
	           a=a.mod(d);
	          
	           System.out.println(a);
	       }
	       
	    }
}
	    
	

