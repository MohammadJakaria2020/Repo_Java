package myRecap;

import javax.sound.midi.Soundbank;
import java.awt.dnd.DragSource;

public class ConLoop001 {
    public static void main(String[] args) {

        // Conditioal Loops :
        /*
        1. If - else;
        2. switch;

        Syntex:
        if (conditions(s)) {
                // if
                // block

        } else {
                // else
               // block

        }

        */
        //Example #1  'IF- ELSE' LOOP

        String days = "weekend";   // it could be weekday or weekend.
        boolean anyMeetings = true;
        String clothes = "";

        //days = weekend ; clothes = casual
        // days = weekdays and meeting = false ; clothes = formal
        //days= weekdays and meeting = true ; clothes = suit

       /* if (days.equals("weekdays") && anyMeetings == false) {
            clothes = "formals";
        } else (days.equals("weekdays") && anyMeetings == true) {
            clothes = "Suit";
        } else if (days.equals("weekend")) {
            clothes = "Casual";
        }
        System.out.println("Clothes for the office will be = " + clothes);

        */

        if (days.equalsIgnoreCase("weekdays") && anyMeetings == false) {
            clothes = "formals";
        } else if (days.equalsIgnoreCase("weekdays") && anyMeetings == true) {
            clothes = "Suit";
        } else {
            clothes = "Casual";
        }
        System.out.println("You have to wear the dress = " + clothes);


        /* Que : Print "Even" if value in num variable is even ;

         */

        int num =10;
        if (num%2==0) {
            System.out.println(num + " is a even number ");
        } else
            System.out.println(num + " is an odd number ");

        /* Que :

        if name length is grater then 10 and number is greater then 5
        Print the below:
            name in all uppercase
            and replace p with b in the name;
            else
            make result as false
         */

//        String name = "Mohmd";
//        boolean result = true;
//        int number = 22;
//        int nameLen = name.length();
//
//        if( nameLen >=5 && number>5){
//            System.out.println(name.toUpperCase());
//            System.out.println(name.replace('p','b'));
//    } else {
//            result= false;
//        }
//        System.out.println(result);

            // Recap: My confusion is why considering ----> Boolean result = True;
            // Lets try with the Boolean variable

                String myName = "MohammadJakaria";
                int myNameLen= myName.length();
                int num1= 20;

//                if (myNameLen>10 && num1 >15){
//                System.out.println("My Name is Mohammad Jakaria");
//                } else
//                System.out.println(" ");

                // Following Deepak style.

                Boolean result= true;
                if (myNameLen> 25 && num1>5) {
                    System.out.println("Mohammad Jakaria Line # 102");
                } else
                    result= false;

                    // Recap : Switch - Deepak's class # 10 Date - Sep 28, 2020

        /**
         * switch (variable){
         * case1:
         * break;
         * case2:
         * break;
         * default;
         *
         * dayName = monday ; print "day 1"
         * dayName =Tuesday; print "day 2"
         *
         */
        String dayName= "Friday";

        switch (dayName){
            case "Monday":
                System.out.println("Day 1");
            break;
            case "Tuesday":
                System.out.println("Day 2");
                break;
            case "Wednesday":
                System.out.println("Day 3");
                break;
            case "Thursday":
                System.out.println("Day 4");
                break;
            case "Friday":
                System.out.println("Day 5");
                break;
            case "Saturday":
                System.out.println("Weekend Day 1");
                break;
            case "Sunday":
                System.out.println("Weekend Day 2");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        /** Que: Based on month name , print season -
         * dec, jan,feb ---> winter
         * mar, apr, may ---> summer
         * jun, jul, aug ---> fall
         * sep, oct, nov ----> spring
         */

        String monthName1 = "apr";
        switch (monthName1){
            case  "dec":
            case  "jan":
            case  "feb":
                System.out.println("Winter");
                break;
            case "mar":
            case "apr":
            case "may":
                System.out.println("summer");
                break;
            case "jun":
            case "jul":
            case "aug":
                System.out.println("fall");
                break;
            case "sep":
            case "oct":
            case "nov":
                System.out.println("spring");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }

        //





        // Switch: to compare the equal

        /* switch (variable )

         */

    /* dayName= monday; print "Day 1"
    dayName = Tuesday 1
     */

            //Based on  month name , print season

            //String monthName= "Jan";
        /*switch (monthName){
            case "Jan":
                System.out.printf("Winter");
                break;
            case "Feb":
                System.out.printf("Winter");
                break;
            default:

         */


            // Class 11: 20201001
    /* For Loop:
    for (int = 0; i<5; i++){
     Sout ()

     1. Java iitialzes thebvariable i to given value (i=0)
     2. verify the condition (i<5 ----> 0,5 = true
     3. if the cinstion is true, java will enter the for loop and execute the code
     4. after the last line of code insire - for -loop, perform increment operations (i++)
     5. go to the top and verify the condition (i<5 ----> 1<5= true )
     6. if the cinstion is true, java will enter the for loop and execute the code; else stop the loop

     */

        /* for (int i=0 ; i<=names.length-1 ; i++) {   // i<4 0,1,2,3
            System.out.println(names[i]);           // i    0,1,2,3

            print the values present in even index      (0,2,4,6,8,...)
         */

            //String[] names = {"My", "Name", "is", "Jakaria"};
            //for (int i = 0; i <= (names%2).length - 1; i++) {
            //    System.out.println("Values present at even index are = " + names);


            //  }


            // Print numbers from 10 to 1;


            //
        }
    }







