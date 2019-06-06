package hackerearth;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Gridandphrase {

	  public static void main(String[] args) throws IOException {
			Reader sc = new Reader();
			int tc = sc.nextInt();
			int l = sc.nextInt();
			 sc.readLine();
			StringBuffer bf = new StringBuffer();
			String ar[] = new String[tc];
			for (int i = 0; i < tc; i++) {
				ar[i] = sc.readLine();
			}
			char arr[][] = new char[tc + 4][l + 4];
			for (int i = 0; i < tc; i++) {
				for (int j = 0; j < l; j++) {
					arr[i][j] = ar[i].charAt(j);
				}
			}

			int c = 0;
			StringBuffer td = new StringBuffer();
			StringBuffer dd = new StringBuffer();
			StringBuffer ud = new StringBuffer();
			for (int i = 0; i < tc; i++) {
				StringBuffer lr = new StringBuffer();
			
				for (int j = 0; j < l; j++) {
					
						if(lr.toString().contains(("saba")))
						{
							c++;
							lr.delete(lr.length()-4, lr.length());
						}
						else
							{
							lr.append(arr[i][j]);
							if(lr.toString().contains(("saba")))
							{
								c++;
								lr.delete(lr.length()-4, lr.length());
							}
							}
						if(td.toString().contains(("saba")))
						{
							c++;
							td.delete(td.length()-4, td.length());
						}
						else
							{
							td.append(arr[j][i]);
							if(td.toString().contains(("saba")))
							{
								c++;
								td.delete(td.length()-4, td.length());
							}
							}
						if(i==j)
						{
							
							if(dd.toString().contains(("saba")))
							{
								c++;
								dd.delete(dd.length()-4, dd.length());
							}
							else
								{
								dd.append(arr[i][j]);
								if(dd.toString().contains(("saba")))
								{
									c++;
									dd.delete(dd.length()-4, dd.length());
								}
								}
							
							
						}
						if(i+j==(tc-1))
						{	
								ud.append(arr[i][j]);
								if(ud.toString().contains(("abas")))
								{
									c++;
									ud.delete(ud.length()-4, ud.length());
								}
								
							
							
						}
						
						
						
//					}
//					if (arr[i + 1][j] == 's' && arr[i + 1][j] == 'a' && arr[i + 2][j] == 'b' && arr[i + 3][j] == 'a') {
//						c++;
//					}
//					if (arr[i][j] == 's' && arr[i][j] == 'a' && arr[i][j] == 'b' && arr[i][j] == 'a') {
//						c++;
//					}
//					if (arr[i][j] == 's' && arr[i][j] == 'a' && arr[i][j] == 'b' && arr[i][j] == 'a') {
//						c++;
//					}
						
					
				}
			
				
				
				
			}
			System.out.println(ud);
			
			System.out.println(c);

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
