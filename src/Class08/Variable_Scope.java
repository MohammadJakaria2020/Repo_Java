package Class08;

import jdk.dynalink.beans.StaticClass;

public class Variable_Scope {

    // FIELD VARIABLE/ GLOBAL VARIABLE / CLASS VARIABLE: only when in your coding, can be used anywhere inside the class
    /**1. Variable which we share between the methods within a class
     * 2. Variables which can access anywhere inside the class
     * 3. use the same variable in multiple places
     *      Scope : entire class
     */
    /**Local variable: create a variable inside a method
     * Scope : within method
     */
//        static String name= "Happy Peace"; // Field variable
//        static int num=10; // Field variable
//        static int b=10; // Field variable
//        final static char Score= 'A';  // Final word used for the constant varieble
//

    static String name = "Happy Peace";
    static int num = 10;

    public static void main(String[] args) {
        String msg = "Stay Safe";  // Field variable
        int a = 10;
        for (int i = 0; i < 10; i++) {
            int b = 10;     // 10  // b local variable for the For Loop
            a += 40;    // 50
            System.out.println(" Value of a (line # 35) : " + a); // 50  and 90
            System.out.println(" Value of b (line # 36) : " + b); // 10 , no value change
        }
        int b = 100;
        System.out.println("Print the line #39 : " + msg);
        System.out.println("Print the line #40 : " + name);
        System.out.println("Print the line #41 : " + a);  /// a variable has access in the main method..
        System.out.println("Print the line #42 : " + b);  // This b is from line-34. But the b in line-29 is a local variable

    }




}

