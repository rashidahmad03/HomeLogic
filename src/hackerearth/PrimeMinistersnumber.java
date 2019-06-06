package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeMinistersnumber {
	static int sum = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t = br.readLine();
		String v[] = t.split(" ");
		StringBuffer bar = new StringBuffer();
		for (int i = Integer.parseInt(v[0]); i < Integer.parseInt(v[1]); i++) {

			//sum = 0;
			int g = getSum(i);
			if (new BigInteger("" + g).isProbablePrime(1))
				if (new BigInteger("" + i).isProbablePrime(1)) {
					bar.append(i + " ");

				}

		}
		System.out.println(bar);

	}

	static int getSum(int n) {
	
		if(n==0)
			return 0;
			else
			{
			    int r=n%10;
			    n=n/10;
			    return r+getSum(n);
			}
	}

}
