package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Goldenrectangles {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String T = bf.readLine();
		int t = Integer.valueOf(T);
		int ca = 0;
		for (int i = 0; i < t; i++) {
			String da = bf.readLine();
			String v[] = da.split(" ");
			int h = Integer.parseInt(v[0]);
			int b = Integer.parseInt(v[1]);
			ca += gold(h, b);
			
		}
		System.out.println(ca);
		
	}

	public static int gold(int h, int b) {

		double x;
		if (h > b)
			x = (double) h / b;
		else
			x = (double) b / h;
		//System.out.println((1.6) >= x);
		if ((1.6) <= x && (1.7) >= x)
			return 1;
		else
			return 0;
	}

}
