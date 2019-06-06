package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CodeStreak {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int j = 0; j < T; j++) {
			int Ar = Integer.parseInt(br.readLine());
			int h[][] = new int[Ar][2];
			for (int i = 0; i < Ar; i++) {
				String input = br.readLine();
				String cc[] = input.split(" ");
				h[i][0] = Integer.parseInt(cc[0]);
				h[i][1] = Integer.parseInt(cc[1]);
			}
			maddd(h);

		}
	}

	public static void maddd(int a[][]) {
		HashMap<Integer, Integer> hs = new HashMap();
		int h = 0, j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i][1] == 0) {
				if (hs.containsKey(a[i][0])) {
					int d = hs.get(a[i][0]);
					d--;
					hs.put(a[i][0], d);
					h = j;
					j = 0;
				} else {
					h = j;
					j = 0;
					hs.put(a[i][0], -1);
				}

			}
			if (a[i][1] == 1) {
				if (hs.containsKey(a[i][0])) {
					int d = hs.get(a[i][0]);
					d++;
					j++;
					hs.put(a[i][0], d);
				} else {
					j++;
					hs.put(a[i][0], 1);
				}

			}

		}

		int c = 0;
		for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
			int value = entry.getValue();
			if (value > 0)
				c++;

		}
		if (j > h)
			h = j;

		System.out.println(h);

	}

}
