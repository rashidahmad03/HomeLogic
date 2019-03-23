package com.rashid;

public class Addtwowithoutaddopratoer {
    public static void main(String[] args) {
        byte a=0x10;
        byte b=0x05;
        System.out.println(ps(a,b));
    }
    private static int ps(int x, int y){
        while (y != 0)
        {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }


}
