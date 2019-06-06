package com.hero;

import java.io.*;
import java.util.*;

public class Depth {
    public static List<String> s=new ArrayList<String>();
  final Integer MAX = 100; // maximum number of connections

  // This array holds the flight information.
  FlightInfo[] flights= new FlightInfo[MAX];

  Integer numFlights = 0; // number of entries in flight array

  Stack btStack = new Stack(); // backtrack stack

  public static void main(String args[]) {
      String to, froma;
      Depth ob = new Depth();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      ob.setup();

      try {
          System.out.print("From? ");
          froma = br.readLine();
          System.out.print("To? ");
          to = br.readLine();

          ob.isflight(froma, to);

          if (ob.btStack.size() != 0)
              ob.route(to);
      } catch (IOException exc) {
          System.out.println("Error on input.");
      }

              System.out.println(s);
  }

  //Initialize the flight database.
  void setup() {
      addFlight("New York", "Chicago", 900);
      addFlight("Chicago", "Denver", 1000);
      addFlight("New York", "Toronto", 500);
      addFlight("New York", "Denver", 1800);
      addFlight("Toronto", "Calgary", 1700);
      addFlight("Toronto", "Los Angeles", 2500);
      addFlight("Toronto", "Chicago", 500);
      addFlight("Denver", "Urbana", 1000);
      addFlight("Denver", "Houston", 1000);
      addFlight("Houston", "Los Angeles", 1500);
      addFlight("Denver", "Los Angeles", 1000);
  }

  //Put flights into the database.
  void addFlight(String froma, String to, Integer dist) {
      if (numFlights < MAX) {
          flights[numFlights] = new FlightInfo(froma, to, dist);

          numFlights++;
      } else
          System.out.println("Flight database full.\n");
  }

  // Show the route and total distance.
  void route(String to) {
      Stack rev = new Stack();
      Integer dist = 0;
      FlightInfo f;
      Integer num = btStack.size();

      // Reverse the stack to display route.
      for (Integer i = 0; i < num; i++)
          rev.push(btStack.pop());

      for (Integer i = 0; i < num; i++) {
          f = (FlightInfo) rev.pop();
          System.out.print(f.froma + " to ");
          s.add(f.froma+"    to    ");
          dist += f.distance;
      }

      System.out.println(to);
      s.add(to);
      System.out.println("Distance is " + dist);
      s.add("Distance is "+dist);
  }

  /*
   * If there is a flight between from and to, return the distance of flight;
   * otherwise, return 0.
   */
  Integer match(String froma, String to) {
      for (Integer i = numFlights - 1; i > -1; i--) {
          if (flights[i].froma.equals(froma) && flights[i].to.equals(to)
                  && !flights[i].skip) {
              flights[i].skip = true; // prevent reuse
              return flights[i].distance;
          }
      }

      return 0; // not found
  }

  // Given from, find any connection.
  FlightInfo find(String froma) {
      for (Integer i = 0; i < numFlights; i++) {
          if (flights[i].froma.equals(froma) && !flights[i].skip) {
              FlightInfo f = new FlightInfo(flights[i].froma, flights[i].to,
                      flights[i].distance);
              flights[i].skip = true; // prevent reuse

              return f;
          }
      }

      return null;
  }

  // Determine if there is a route between from and to.
  void isflight(String froma, String to) {
      Integer dist;
      FlightInfo f;

      // See if at destination.
      dist = match(froma, to);
      if (dist != 0) {
          btStack.push(new FlightInfo(froma, to, dist));
          return;
      }

      // Try another connection.
      f = find(froma);
      if (f != null) {
          btStack.push(new FlightInfo(froma, to, f.distance));
          isflight(f.to, to);
      } else if (btStack.size() > 0) {
          // Backtrack and try another connection.
          f = (FlightInfo) btStack.pop();
          isflight(f.froma, f.to);
      }
  }  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}