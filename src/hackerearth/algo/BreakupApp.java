package hackerearth.algo;

import java.util.Scanner;

public class BreakupApp {
	public static void main(String...a) {
		   Scanner s = new Scanner(System.in);
		   int N = s.nextInt();
		   int count19=0,count21=0;
		   String str="";
		   for (int i = 0; i < N; i++) {
		   str=s.nextLine();
		   if(str.startsWith("G")){
		   if(str.contains("19")){count19=count19+2;}
		   if(str.contains("21")){count21=count21+2;}
		   }
		   else if(str.startsWith("B")){
		   if(str.contains("19")){count19++;}
		   if(str.contains("21")){count21++;}
		   }


		   }

		   if(count19>count21){System.out.println("Date");}
		   else {System.out.println("No Date");}
		   }
		   }