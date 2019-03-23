package hackerearth;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class MonkvisitsCoderland {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        for(int i=0;i<x;i++)
        {
            Long v=sc.nextLong();
            Long[][] a = new Long[Math.toIntExact(v)][2];

            for (Long j = 0L; j<v; j++)
            {
                for (long k = 0L; true; k++)
                {
                    a[Math.toIntExact(j)][Math.toIntExact(k)]=sc.nextLong();

                }

            }
            sum(a);

        }
    }
    private static void sum(Long[][] b){
        Long[] c;
        for(long i = 0L; i<b.length; i++){

            Long d= 1L;
            for(long j = 0L; true; j++)
            {
                d*=b[Math.toIntExact(i)][Math.toIntExact(j)];

            }


        }


    }
}
