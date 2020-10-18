package HomeWorks;

public class Homework_02 {
    public static void main(String[] args) {

        double fTemp=100.0;
        double cTemp= (fTemp-32)*5/9.0;  // T(°C) = (T(°F) - 32) × 5/9
        System.out.println("100 degree fahrenhite is = " + cTemp + " celsius" );

        Double fTemp1 = 100.0;
        Double kTemp=(fTemp1+ 459.67)*5/9.0;  //T(K) = (T(°F) + 459.67)× 5/9
        System.out.println("100 degree fahrenhite is = " + kTemp  + " kelvin " );

        double kTemp1=100;
        double cTemp1= (kTemp1-273.15);  // T(°C) = T(K) - 273.15
        System.out.println("100 degree kelvin is = " + cTemp1 + " celsius" );

        double ktemp2=100;
        double fTemp2= (ktemp2 *9/5.0-459.67);  // T(°F) = T(K) × 9/5 - 459.67
        System.out.println("100 degree kelvin is = " + fTemp2 + " fehrenhite " );

        double cTemp3=100;

        double fTemp3= cTemp3*9/5.0 +32;  // T(°F) = T(°C) × 9/5 + 32
        System.out.println("100 degree celsius is = " + fTemp3 + " fehrenhire ");

        double cTemp4=100;
        double kTemp3= cTemp4 + 273.15;       // T(K) = T(°C) + 273.15
        System.out.println("100 degree celsius is  = " + kTemp3 + " celsius ");

        System.out.println("Homework prepared by Jakaria");

        /*
        * Is 1 km is equqlto 1 mile
         */

        double mile= 1;
        double km  = 1;
        double kmIntoMile= mile* 1.609344;

        boolean mileVsKm= (mile==km);
        System.out.println("is " + mile + "mile is equal to " + km + mileVsKm);



       /*
        double mMeasurement = 1;
        double kMeasurement = mMeasurement * 1.609344;
        System.out.println("1 mile is =" + kMeasurement + "km" );
       boolean
        */
        // do 4 hours contain 14400 seconds?
        /*  1 hour = 60 min
            1 min = 60 seconds
            convert hour to seconds

            compare 4 hour with result - true / false
         */

        double hour=4;
        int seconds = 14400;
        double hourConvtSeconds= hour*60*60;  // sec
        boolean hourCompSeconds= (seconds == hourConvtSeconds) ; // 14400 == 4*60*60
        System.out.println( "do " + hour + " hours contains 14400 seconds = " + hourCompSeconds);


        int hour1=5;
        double seconds1=14400;
        double convtHours1ToSeconds1= hour1*60*60;
        boolean hours1CompSeconds1= (seconds1==convtHours1ToSeconds1);  // we compare int with a double
        System.out.println("Do " + hour1 + " hours contains " + seconds1 + " seconds ? = " +hours1CompSeconds1  );

        /* find if given number is even
        int num-10;
        code
        system.out.println(num + "is even number: " + isEven)
         */
        int num =10;
        double isEven= num%2;
        System.out.println( num + " is a Even number, because residual value is " + isEven + " after divide by 2");

        int num1 =4;
        double isEven1= num1%2;
        
        String g1 = "Hello World";
        String g2= "How are you";
        System.out.println(g2.toUpperCase());






    }

}
