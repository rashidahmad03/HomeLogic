package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Duration {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String n[] = new String[T];
		for (int i = 0; i < T; i++) {
			n[i] = br.readLine();

		}
		StringBuffer bf = new StringBuffer();
		for (int i = 0; i < T; i++) {
			int h = 0, m = 0;
			String v[] = n[i].split(" ");
			int SH = Integer.parseInt(v[0]);
			int SM = Integer.parseInt(v[1]);
			int EH = Integer.parseInt(v[2]);
			int EM = Integer.parseInt(v[3]);
			h = EH - SH - 1;
			m = (60 - SM) + EM;

			if (m >= 60) {
				m -= 60;
				h++;
			}
			bf.append(h + " " + m + "\n");

		}
		System.out.println(bf);
	}
}
