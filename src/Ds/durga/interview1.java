package Ds.durga;

public class interview1 {
	static StringBuffer s=new StringBuffer("rashid is a great");

	public static void main(String[] args) {
		
		int i=0,j=0,w=0;
		System.out.println(s);
		while(i<s.length())
		{
			if(i==0)
			w=0;
			if(s.charAt(i)==' ' || i==s.length()-1)
			{
				j=i;
				if(i==s.length()-1)
				j=i;
					else
					j--; 
				swap(w,j);
				w=i+1;
			}
			
			
			i++;
			
		}//while(i<s.length())
				swap(0,s.length()-1);
				System.out.println(s);
				
		
		System.out.println(s);

	}
	public static void swap(int i,int j)
	{
		while(i<j) {
		char ch=s.charAt(i);
		s.setCharAt(i, s.charAt(j));
		s.setCharAt(j,ch);
		i++;
		j--;
	}
	}

}
