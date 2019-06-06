package com.rashid;
import java.util.*;
import java.net.*;

public class javatogethtmlcode {

    /**
     * Represents a class that receive a String URL
     * and print this HTML souce-code
     *
     * @author: Rafael Valle
     */

        public static void main(String[] args) {

            //String that receive the URL
            String url = "rashidahmad.ml";

            getHTML(url);
        }

        private static void getHTML(String url) {
            URLConnection connection;
            Scanner sc = null;
            String html = "";

            try {
                connection = new URL("http://" + url).openConnection();
                sc = new Scanner(connection.getInputStream());

                while(sc.hasNext()) {
                    System.out.println(sc.nextLine());
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if(sc != null) {
                    sc.close();
                }
            }
        }
    }
