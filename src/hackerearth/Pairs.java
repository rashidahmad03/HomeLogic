package hackerearth;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class Pairs {
	static int a[];
	
	public static void main(String[] args) throws IOException {
		Reader scan=new Reader();
		a = sq();
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int l = scan.nextInt();
			int r = scan.nextInt();
			comput(l, r);
		}
	}

	public static void comput(int l, int r) {
		int p = 0;
		if (l == 1) {
			l++;
		}
		for (int i = l; i <= r; i++) {
			if (a[i] == 0) {
				p++;
			}
		}
		System.out.println(p);
		int c=r-l+1;
		System.out.println(c);
		System.out.println(p * (r - l + 1)-p);
	}

	public static int[] sq() {

		int a[] = new int[100001];
		for (int i = 2; i <= Math.sqrt(10000) + 1; i++) {
			if (a[i] == 0) {
				for (int j = 2; j * i <= 10000; j++) {
					a[i * j] = 1;
				}
			}
		}
//		int k=0;
//	for(int ass:a)
//		{if(ass==0)
//		System.out.print(k+" ");
//		k++;
//		
//		}
		return a;
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

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
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

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

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
