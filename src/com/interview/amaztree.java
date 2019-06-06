package com.interview;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class amaztree {
	static ArrayList<Integer> ls = new ArrayList<Integer>();
	static StringBuffer rs = new StringBuffer();

	public static void main(String[] args) throws IOException {
		Reader sc = new Reader();
		int H = 0;
		int cs = 1;
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int ar[] = new int[N];
		for (int i = 0; i < 0; i++)
			ar[i] = sc.nextInt();
		for (int i = 0; i < N - 1; i++)
		{
			if (i > cs) {
				cs = (int) Math.pow(2, cs);

				H++;

			} 
			sc.nextInt();
			ls.add(sc.nextInt());
		}
		
		for (int i = 0; i < Q; i++) {
			int l = sc.nextInt();
			int X = sc.nextInt();
			int f = l % (H + 1);
			if (f == 0)
				rs.append("-1\n");
			else {

				int e = (int) Math.pow(2, f);
				int m = (int) Math.pow(2, f - 1);

				if (ls.size() < e) {
					ArrayList<Integer> sm = new ArrayList<Integer>();
					sm.addAll(ls.subList(m, ls.size()));
					rs.append(++X+"\n");

				} else {
					ArrayList<Integer> sm1 = new ArrayList<Integer>();
					sm1.addAll(ls.subList(m, e + 1));
					rs.append(++X+"\n");
				}

			}

		}
		System.out.println(rs);
	}

	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}
		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
}