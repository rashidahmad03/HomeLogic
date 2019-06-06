package com.rashid;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

@SuppressWarnings("MagicConstant")
public class Calender {
    public static void main(String[] args) {

        System.out.println("Enter year to find clander");
        Scanner sc=new Scanner(System.in);


        String year1 = sc.nextLine();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int[] noofdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int year = Integer.parseInt(year1);
        if (leap(year)) {
            noofdays[1] = 29;
        }
        System.out.println();
        int dow;
        for (int i = 0; i < 12; i++) {
            System.out.println(String.format("%15s", "") + months[i] + "  " + year);
            System.out.println();
            for (int j = 0; j < 7; j++)
                System.out.print(String.format("%3s", "") + days[j]);
            System.out.println(" ");
            dow = dow(i + 1, year);
            for (int k = 1; k <= dow; k++)
                System.out.print(String.format("%6s", ""));
            for (int l = 0; l < noofdays[i]; l++) {
                System.out.print(String.format("%" + (4 + 2 - String.valueOf(l + 1).length()) + "s", "") + (l + 1));
                if ((l + dow + 1) % 7 == 0)
                    System.out.println();
            }
            System.out.println();
            System.out.println(" ");
        }
    }

    // for calculation of day of week
    private static int dow(int mm, int yyyy) {
        Calendar GC = new GregorianCalendar();
        GC.set(yyyy, mm - 1, 1, 12, 0, 0);
        int DOW = GC.get(Calendar.DAY_OF_WEEK); // 6=Friday
        return DOW - 1;
    }

    // Function to chek the year is leap or not.
    private static boolean leap(int yyyy) {
        return (yyyy % 4 == 0 && yyyy % 100 != 0) || (yyyy % 400 == 0);
    }
}









/*
output #####
*
*Enter year t find clander
2019

               January  2019

   Sun   Mon   Tue   Wed   Thu   Fri   Sat
                 1     2     3     4     5
     6     7     8     9    10    11    12
    13    14    15    16    17    18    19
    20    21    22    23    24    25    26
    27    28    29    30    31

               February  2019

   Sun   Mon   Tue   Wed   Thu   Fri   Sat
                                   1     2
     3     4     5     6     7     8     9
    10    11    12    13    14    15    16
    17    18    19    20    21    22    23
    24    25    26    27    28

               March  2019

   Sun   Mon   Tue   Wed   Thu   Fri   Sat
                                   1     2
     3     4     5     6     7     8     9
    10    11    12    13    14    15    16
    17    18    19    20    21    22    23
    24    25    26    27    28    29    30
    31

               April  2019

   Sun   Mon   Tue   Wed   Thu   Fri   Sat
           1     2     3     4     5     6
     7     8     9    10    11    12    13
    14    15    16    17    18    19    20
    21    22    23    24    25    26    27
    28    29    30

               May  2019

   Sun   Mon   Tue   Wed   Thu   Fri   Sat
                       1     2     3     4
     5     6     7     8     9    10    11
    12    13    14    15    16    17    18
    19    20    21    22    23    24    25
    26    27    28    29    30    31

               June  2019

   Sun   Mon   Tue   Wed   Thu   Fri   Sat
                                         1
     2     3     4     5     6     7     8
     9    10    11    12    13    14    15
    16    17    18    19    20    21    22
    23    24    25    26    27    28    29
    30

               July  2019

   Sun   Mon   Tue   Wed   Thu   Fri   Sat
           1     2     3     4     5     6
     7     8     9    10    11    12    13
    14    15    16    17    18    19    20
    21    22    23    24    25    26    27
    28    29    30    31

               August  2019

   Sun   Mon   Tue   Wed   Thu   Fri   Sat
                             1     2     3
     4     5     6     7     8     9    10
    11    12    13    14    15    16    17
    18    19    20    21    22    23    24
    25    26    27    28    29    30    31


               September  2019

   Sun   Mon   Tue   Wed   Thu   Fri   Sat
     1     2     3     4     5     6     7
     8     9    10    11    12    13    14
    15    16    17    18    19    20    21
    22    23    24    25    26    27    28
    29    30

               October  2019

   Sun   Mon   Tue   Wed   Thu   Fri   Sat
                 1     2     3     4     5
     6     7     8     9    10    11    12
    13    14    15    16    17    18    19
    20    21    22    23    24    25    26
    27    28    29    30    31

               November  2019

   Sun   Mon   Tue   Wed   Thu   Fri   Sat
                                   1     2
     3     4     5     6     7     8     9
    10    11    12    13    14    15    16
    17    18    19    20    21    22    23
    24    25    26    27    28    29    30


               December  2019

   Sun   Mon   Tue   Wed   Thu   Fri   Sat
     1     2     3     4     5     6     7
     8     9    10    11    12    13    14
    15    16    17    18    19    20    21
    22    23    24    25    26    27    28
    29    30    31


Process finished with exit code 0
*
* */