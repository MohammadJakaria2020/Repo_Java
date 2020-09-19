package Homework02;

public class HW02 {
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


    }











}
