package hackerearth;

import java.util.Scanner;

public class emazein {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		int x = 0, y = 0;
		for (int i = 0; i < ss.length(); i++) {
			if (ss.charAt(i) == 'L')
				x--;
			if (ss.charAt(i) == 'R')
				x++;
			if (ss.charAt(i) == 'U')
				y++;
			if (ss.charAt(i) == 'D')
				y--;
		}
		System.out.println(x + " " + y);

	}

}
