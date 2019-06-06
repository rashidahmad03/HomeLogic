package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoStrings {
	static StringBuffer bf = new StringBuffer();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String h[][] = new String[T][2];
		;
		for (int i = 0; i < T; i++) {
			String input = br.readLine();
			String cc[] = input.split(" ");
			h[i][0] = cc[0];
			h[i][1] = cc[1];
		}

		for (int i = 0; i < T; i++) {
			match(h[i][0], h[i][1]);

		}
		System.out.println(bf);
	}

	public static void match(String a, String b) {
		if (a.length() != b.length()) {
			bf.append("NO\n");
			return;
		} else {
			char aa[] = a.toCharArray();
			char bb[] = b.toCharArray();
			Arrays.sort(aa);
			Arrays.sort(bb);
			boolean f = false;
			for (int j = 0; j < aa.length; j++) {
				if (aa[j] != bb[j]) {
					f = false;
					break;
				} else
					f = true;

			}
			if (!f)
				bf.append("NO\n");
			else
				bf.append("YES\n");

		}

	}

}
