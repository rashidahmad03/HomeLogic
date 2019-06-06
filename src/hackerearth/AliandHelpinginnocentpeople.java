package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AliandHelpinginnocentpeople {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		String res = new Test().Calc(str);
		System.out.println(res);

	}

}

class Test {
	public String Calc(String str) {
		int len = str.length();
		int n1 = Integer.parseInt(str.substring(0, 1));
		int n2 = Integer.parseInt(str.substring(1, 2));
		if ((n1 + n2) % 2 != 0) {
			return "invalid";
		}
		String vow = str.substring(2, 3);
		if (vow.equals("A") || vow.equals("E") || vow.equals("I") || vow.equals("O") || vow.equals("U")
				|| vow.equals("Y")) {
			return "invalid";
		}
		int n3 = Integer.parseInt(str.substring(3, 4));
		int n4 = Integer.parseInt(str.substring(4, 5));
		int n5 = Integer.parseInt(str.substring(5, 6));
		if ((n3 + n4) % 2 != 0 || (n4 + n5) % 2 != 0) {
			return "invalid";
		}
		int n6 = Integer.parseInt(str.substring(7, 8));
		int n7 = Integer.parseInt(str.substring(8, 9));
		if ((n6 + n7) % 2 != 0) {
			return "invalid";
		}
		return "valid";
	}
}