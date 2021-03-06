package hackerearth;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class MicroandArrayUpdate {

 public static void main(String[] args) throws Exception {
		Reader scan = new Reader();
		PrintWriter out = new PrintWriter(System.out, true);

			int n = scan.nextInt();
			
		
		for (int i = 0; i < n; ++i) {
		
			int arz = scan.nextInt();
			int d = scan.nextInt();
			int max = Integer.MAX_VALUE;
			for (int j = 0; j < arz; j++) {
				int tk = scan.nextInt();
				if (tk < max) {
					max = tk;
					
				}
			
				
			}
			out.println(d-max);
			
	
			
	}
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
	}
}
