package Class04_String;

import java.util.Arrays;

public class stringClass {
        public static void main(java.lang.String[] args) {

            /*find the length of the last word in the statement

             */

            // Recap: Find the given number is Even

            int  num =10;
            int reminder=0;
            boolean reminderIsZero= (reminder==num%2);
            System.out.println(num + " is a Even number = " + reminderIsZero);

    /*Recap:
      Ternary: ( ?:)
     */

            int  creditScore= 690;
            double mortgageRate= 1.1;
            double mortgageRate1= 2.0;
            double myMortageaRate= creditScore>700?mortgageRate:mortgageRate1;
            System.out.println(" if my Credit Score is " + creditScore + " , Mortage rate will be = "  + myMortageaRate);

            int  time=10;
            java.lang.String greeting1= "Good Morning";
            java.lang.String greeting2 = "Good day";
            java.lang.String myGreet = time>12?greeting2:greeting1;
            System.out.println(myGreet);

            // Advanced assignment
        /*
        +=; -=; *=; /=; %=;
         */

            int num1 =100;
            int num2=num1+=5;
            System.out.println("Value of num2 = "+ num2);
            num2-=5;
            System.out.println(num2);

            num2*=2;
            System.out.println(num2);
            num2%=30;
            System.out.println(num2);

            // String : Methods used under string
            // Length:

            java.lang.String cityName = "New York City";
            int lengthOfCityName= cityName.length();
            System.out.println(lengthOfCityName);

            // Convert to lower case:
            /* Syntex : String var.toLowercase = value; --> in a string also;

             */
            java.lang.String cityNameInLowerCase = cityName.toLowerCase();
            System.out.println("My City name is = " + cityNameInLowerCase);
            System.out.println("My City name is = " + cityName);
            // change the value of original variable and store in the same original variable :
            cityName= cityName.toLowerCase();
            System.out.println("City name is = " + cityName);
            // Covert to UPPER CASE:
            cityName=cityName.toUpperCase();
            System.out.println("City name is = " + cityName);

            // Compare that two string are identical - we use equals ();
            /* the equals result will be a Boolean - true / false ;
             */

            java.lang.String cityName1= "new york city";
            java.lang.String cityName2= "New York City";
            java.lang.String cityName3= "NEW YORK CITY";

            Boolean cityName4=  cityName1.equals(cityName2);
            System.out.println("City name " + cityName1 + " is identical with  " + cityName2 + " is = "+ cityName4);

            Boolean cityName5=  cityName1.equalsIgnoreCase(cityName2);
            System.out.println("City name " + cityName1 + " is identical with  " + cityName2 + " is = "+ cityName5);

            // To find a particular sequence is present in the string:
            /* Contains ()
             */
            Boolean cityName_USA= cityName1.contains("New");

            System.out.println(cityName_USA);

            Boolean cityName_USA1= cityName1.contains("new");
            System.out.println(cityName_USA1);

            // Please follow this example:

            java.lang.String var1= "Mohammad Jakaria";
            java.lang.String var2 = "mOH";
            boolean var3= var1.toLowerCase().contains(var2.toLowerCase());
            System.out.println(var3);  // the outcome is true


            // Replace :
            /* replace a single character, or , multiple character or , all
             */
            java.lang.String var4= var1.replace('J','Z');
            System.out.println(var4);

            java.lang.String var5=var1.replace("Moh","MOH");
            System.out.println(var5);

            // last index of :

            int lastIndx=  cityName1.lastIndexOf('i');
            System.out.println(lastIndx);

            // Trim: cutting extra space form the beginning and ending space
            java.lang.String cityName6   = "       New York City";
            java.lang.String cityName_trim= cityName6.trim();
            System.out.println(cityName_trim);

            java.lang.String cityName7   = "New York City       ";
            java.lang.String cityName_trim1= cityName7.trim();
            System.out.println(cityName_trim1);

            // Substring: fetch a portion of a string

            java.lang.String cityname8= cityName7.substring(4);
            System.out.println(cityname8);

            cityname8=cityname8.substring(4,9 );
            System.out.println(cityname8);


            // Split : to cut the string into multiple string array.
            /*
             */
            cityName = "New York City in the toWN of New York";
            String [] cityName_Split= cityName.split(" ");
            System.out.println(Arrays.toString(cityName_Split));

            cityName_Split= cityName.split("o");
            System.out.println(Arrays.toString(cityName_Split));

            cityName = "New York City in the toWN of New York";
            String [] cityName_Split1= cityName.split("");
            System.out.println(Arrays.toString(cityName_Split1));


            // Last Index of :
            /* will return the index of the last occurance or else Return -1


             */

            // RECAP:::
            //String myName= " Mohammad Jakaria";




        }


    }


