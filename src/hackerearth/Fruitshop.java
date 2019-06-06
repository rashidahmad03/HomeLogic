package hackerearth;

	
	

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;


class Fruitshop {
 public static void main(String[] args) throws Exception {
		Reader scan = new Reader();
		PrintWriter out = new PrintWriter(System.out, true);
		long pricea,priceb,pricep,numa,numb,nump,coins;
		

		pricea= scan.nextInt();
		priceb= scan.nextInt();
		pricep= scan.nextInt();
		numa= scan.nextInt();
		numb= scan.nextInt();
		nump= scan.nextInt();
		coins= scan.nextInt();
		 long  sum=0;
	 long count=0;
		while(true){
			if(numa>=0 && numb>=0) {
			if((sum+(priceb+pricea))<=coins){
			numa--;
			numb--;
			count+=2;
			sum+=pricea+priceb;
			}
			else
			break;
			
			}
			else if(numa>=0 && nump>=0) {
			if((sum+(pricep+pricea))<=coins){
			numa--;
			nump--;
			count+=2;
			sum+=pricea+pricep;
			}
			else break;
			}
			}
		end:
			out.println(count);
		
	
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

	}

}