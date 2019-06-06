package hackerearth;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class RoyandSymmetricLogos {

	public static void main(String[] args) throws IOException {
		StringBuffer outbf = new StringBuffer();
		Reader scan = new Reader();
		PrintWriter out = new PrintWriter(System.out, true);

		int T = scan.nextInt();
		for (int t = 0; t < T; t++)

		{
			int N = scan.nextInt();
            boolean[][] m = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    m[i][j] = scan.scanBoolean();
                }
            }
            boolean match = true;
            for (int i = 0; i <= N/2; i++) {
                for (int j = 0; j <= N/2; j++) {
                    if (m[i][j] != m[i][N-j-1] || m[i][j] != m[N-i-1][j] || m[i][j] != m[N-i-1][N-j-1]) {
                        match = false;
                        break;
                    }
                }
            }

			
			if (match)
				outbf.append("YES\n");
			else
				outbf.append("NO\n");

			

		}out.println(outbf);

	}
	public static int round(double d) {
	    if (d > 0) {
	        return (int) (d + 0.5);
	    } else {
	        return (int) (d - 0.5);
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

		public String readLine() throws IOException {
			byte[] buf = new byte[64];
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
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
		 public boolean scanBoolean() throws IOException {
		        int integer=0;
		        int n=read();
		        while(isWhiteSpace(n)) {
		            n=read();
		        }
		        return n == '1';
		    }   private boolean isWhiteSpace(int n) {
		        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1) {
		            return true;
		        }
		        return false;
		    }
	}
}
