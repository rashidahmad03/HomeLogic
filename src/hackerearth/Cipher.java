package hackerearth;

import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		String T = sc.nextLine();
		int k =Integer.parseInt( sc.nextLine());
		for (int i = 0; i < T.length(); i++) {
			if(T.charAt(i) >= 'a' && T.charAt(i) <= 'z'|| T.charAt(i) >= 'A' && T.charAt(i) <= 'Z' || T.charAt(i) >= '0' && T.charAt(i) <= '9'){
			if (T.charAt(i) >= 'a' && T.charAt(i) <= 'z') {
				char g=(char) (T.charAt(i) + k);
				if(g>'z')
				{
					int f=g%'z';
					sb.append((char)('a'+f-1) + "");
				}
				else
				sb.append((char)(g) + "");

			}
			if (T.charAt(i) >= 'A' && T.charAt(i) <= 'Z') {
				char g=(char) (T.charAt(i) + k);
				if(g>'Z')
				{
					int f=g%'Z';
					sb.append((char)('A'+f-1) + "");
				}
				else
				sb.append((char)(g) + "");

			}
			if (T.charAt(i) >= '0' && T.charAt(i) <= '9') {
				char g=(char) (T.charAt(i) + k);
				if(g>='9')
				{
					int f=g%'9';
					sb.append((char)('0'+f-1) + "");
				}
				else
				sb.append((char)(g) + "");

			}
			}
			else
			{
				sb.append(T.charAt(i) + "");
			}
		}

		System.out.println(sb);
	}

}
