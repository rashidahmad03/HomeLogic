package hackerrank.Day30;


//Complete this code or write your own from scratch
import java.util.HashMap;
import java.util.Scanner;


public class Day8 {
    public static void main(String []argh){
        HashMap<String,Integer> hpp=new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
                hpp.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(hpp.containsKey(s))
                System.out.println(s+"="+hpp.get(s));
            else
                System.out.println("Not found");
            // Write code here
        }
        in.close();
    }
}


