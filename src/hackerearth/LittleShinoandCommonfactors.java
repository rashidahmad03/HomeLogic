package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LittleShinoandCommonfactors {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String ad = bf.readLine();
		String v[] = ad.split(" ");
		long x = Long.parseLong(v[0]);
		long y = Long.parseLong(v[1]);
		BigInteger b1=new BigInteger(v[0]);
		
		BigInteger b2=new BigInteger(v[1]);
		Long gcd=Long.parseLong(""+b1.gcd(b2));
				//gcd(x,y);
		
		
	Long c=0l;
	for(Long i=1l;i<=gcd;i++)
	{
		if(x%i==0 && y%i==0)
			c++;
	}
	System.out.println(c);
	primeFactors(x);
		
	}
	public static Long gcd(Long a,Long b)
	{
		if (b == 0) 
	        return a; 
	    return gcd(b, a % b);  
		
	} public static void primeFactors(long n) 
    { 
        // Print the number of 2s that divide n 
        while (n % 2 == 0) { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
  
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i += 2) { 
            // While i divides n, print i and divide n 
            while (n % i == 0) { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
  
        // This condition is to handle the case whien 
        // n is a prime number greater than 2 
        if (n > 2) 
            System.out.print(n); 
    } 
  
	

}
