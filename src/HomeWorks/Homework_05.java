package HomeWorks;

import java.util.Arrays;

public class Homework_05 {
    public static void main(String[] args) {

        //Recap from the last class:
        // USING THE FOR LOOP
//        String[] names = {"Happy", "Peace", "Joy", "Laugh"};
//        for (int i=0; i<=names.length-1; i++){
//            System.out.println(names[i]);
//        }

        /** Print the values in even index (0,2,4,6,8 .....)
         * Code
         * Sout
         */
//
        // USING ENHANCED FOR LOOP:
        /** Sybtex:
         * for (datatype var: arrName){
         * var
         * }
         * // for 1st Loop -- > var = arrName[0]
         *         for 2nd Loop --- > var= arrName [1]
         */
//        String[] names3 = {"Happy", "Peace", "Joy", "Laugh"};
//        for (String name : names3) {
//            System.out.println("Print from Enhanced for Loop = " + name);
//        }

        // }

        // HOMEWORK #5
        // Q#1:  Write code/method to return abbreviation for any given string

        /** Example: String msg= "Outfit of the day"
         * expected : OOTD // GM HAGDTY
         * String msg= "have a great day to you"
         *sout ("Abbreviation : " + abr ) // HHAPL
         */

        String msg = "Have Happy and prosperous life";
        String abr = "";

        String[] msgSpl = msg.toUpperCase().split(" ");
        for (int i = 0; i <= msgSpl.length - 1; i++) {
            abr = abr + msgSpl[i].charAt(0);
        }
        System.out.println("Print form the line # 54 in  Abbrevation : " + abr);

        // QUE: String line= "once upon a tiMe in the UNIVERSE";
        /** 1. Print sout ("Line (before modification) : " + line);
         *
         */

        String line = "once upon a tiMe in the UNIVERSE";
        System.out.println("Prit Line # 62-->Line (before modification) : " + line);
        String[] str = line.toUpperCase().split(" ");
        line = "";
        for (int i = 0; i <= str.length - 1; i++) {
            line = line + " " + str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
        }
        line = line.trim();
        System.out.println("print line # 69---> Line (after modification) :  " + line);

//        // REVERSE A STRING
//        String message = "Happy Holidays";
//        System.out.println("Message (Print Line # 74)  : " + message);
//
//        String[] msgSplit=message.toUpperCase().split(" ");
//        String reverseMessage = "";
//        for (int i=0; i<=msgSplit.length -1; i++){
//            reverseMessage=reverseMessage+ ""+ msgSplit[i].lastIndexOf(" ");
//            System.out.println(reverseMessage);
//        }


    }
}
