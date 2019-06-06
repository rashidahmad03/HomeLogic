package com.rashid;

public class UnicodeChars {
    public static void main(String[] argv) {
        StringBuilder b = new StringBuilder(  );
        for (char c = 'a'; c<'d'; c++) {
            b.append(c);
        }
        b.append('\u00a5');    // Japanese Yen symbol
        b.append('\u01FC');    // Roman AE with acute accent
        b.append('\u0391');    // GREEK Capital Alpha
        b.append('\u03A9');
        b.append('\u03A5');// GREEK Capital Omega

        for (int i=0; i<b.length(  ); i++) {
            System.out.println("Character #" + i + " is " + b.charAt(i));
        }
        System.out.println("Accumulated characters are " + b);
    }
}
