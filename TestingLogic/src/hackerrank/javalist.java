package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class javalist {
    private static int c;
   private static final ArrayList<Integer> ls= new ArrayList<>(c);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        c = sc.nextInt();


        for (int i = 0; i < c; i++) {
            int x = sc.nextInt();
            ls.add(x);


        }
        int xs=sc.nextInt();
        for(int i=0;i<xs;i++) {
            String cond = sc.next();
            if (cond.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                ins(x, y);
            }
            if (cond.equals("Delete")) {
                int x = sc.nextInt();
                delete(x);
            }
        }
        for(int lk:ls)
            System.out.print(lk+" ");


    }
    private static void ins(int x, int y){
        ls.add(x,y);


    }
    private static void delete(int x){
    ls.remove(x);
    }
}
