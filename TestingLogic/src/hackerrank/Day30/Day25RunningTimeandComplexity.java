package hackerrank.Day30;
import java.math.BigInteger;
import java.util.Scanner;

public class Day25RunningTimeandComplexity {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			BigInteger br = new BigInteger("" + sc.nextInt());
			if (br.isProbablePrime(1)) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}

	}

}
