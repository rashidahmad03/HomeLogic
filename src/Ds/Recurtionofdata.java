package Ds;

public class Recurtionofdata {

	public static void main(String[] args) {
		int g = rec(1);
		System.out.println(g);
	}

	public static int rec(int i) {

		if ((i + (i * 2)) >= 13)
			return i;
		else {
			i++;
			return rec(i);
		}
	}

}
