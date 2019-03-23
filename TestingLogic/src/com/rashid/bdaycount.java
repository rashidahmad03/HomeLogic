package com.rashid;

import java.time.*;
import java.util.Scanner;

public class bdaycount {


        public static void main (String[] args) {
            Scanner keyboard = new Scanner(System.in);

            try {
                final int year = keyboard.nextInt();
                final int month = keyboard.nextInt();
                final int day = keyboard.nextInt();

                new BirthdayCountdown(LocalDate.of(year, month, day));
            } catch (Exception e) {
                System.out.println("This application outputs how much time there is left until your bithday.");
                System.out.println("It takes 3 paramaters - year, month and day.\n");
                System.out.println("Please insert one paramater per line, like this:\nYYYY\nMM\nDD");
            }
        }
    }

    class BirthdayCountdown {
        private int yearOfBirth;
        private int monthOfBirth;
        private int dayOfBirth;

        public BirthdayCountdown(LocalDate birthday) {
            final boolean isToday = birthday.getMonth() == LocalDate.now().getMonth()
                    && birthday.getDayOfMonth() ==LocalDate.now().getDayOfMonth();

            if(birthday.isAfter(LocalDate.now())) {
                System.out.println("Please insert a valid birthday.");
            } else if (isToday) {
                System.out.println("HAPPY BIRTHDAY! Have a wonderful day, eat lots of cake and drink like there's no tomorrow!");
            } else {
                yearOfBirth = birthday.getYear();
                monthOfBirth = birthday.getMonthValue();
                dayOfBirth = birthday.getDayOfYear();
                timeRemaining();
            }
        }

        private void timeRemaining() {
            int currYear = LocalDate.now().getYear();
            int currMonth = LocalDate.now().getMonthValue();
            int currDay = LocalDate.now().getDayOfYear();

            //TIME REMAINING
            int hrsRemaining = 24 - LocalTime.now().getHour() - 1;
            int minsRemaining = 60 - LocalTime.now().getMinute() - 1;
            int secsRemaining = 60 - LocalTime.now().getSecond();
            //Find how many days in the year in order to calculate the number of days left
            final int daysInYear = LocalDate.now().isLeapYear() ? 366 : 365;
            int daysRemaining = dayOfBirth > currDay ?
                    dayOfBirth - currDay - 1:
                    (daysInYear - currDay) + dayOfBirth - 1;

            final int age = monthOfBirth > currMonth ?
                    currYear - yearOfBirth :
                    currYear + 1 - yearOfBirth;

            System.out.println("There are " + daysRemaining + " days,\n"
                    + hrsRemaining + " hours,\n"
                    + minsRemaining + " minutes and\n"
                    + secsRemaining + " seconds until\n"
                    + "you turn " + age + "!");
        }
    }