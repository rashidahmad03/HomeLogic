package com.hero;

public class FlightInfo {
public	String froma;

   public String to;

   public Integer distance;

    boolean skip; // used in backtracking

    FlightInfo(String f, String t, Integer d) {
        froma = f;
        to = t;
        distance = d;
        skip = false;
    }
}