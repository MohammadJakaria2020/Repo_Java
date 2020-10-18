package ClassLec;

public class Class11_Oct01 {
    public static void main(String[] args) {

      // LOOPS: Repeat actions
        /**
         * 1. for Loop
         * 2. while loop
         * 3. do -while loop
         * 4. Enhanced for Loop
         * NEVER do an infinite loop -
         *
          */

        /**1. FOR LOOP:
         * Syntex:
         * for (initialization; condition; increment) {
         */

        /** Print "Hello" 5 times.
         * For Loop - how works:
         *  1. Java initializes  the variable i to given value (i=0)
         *  2. verify the consdtion (i<5 ) // 0<5 = true;
         *  3. if result of condition is true, java will enter the for - Loop amd execute the code
         *  4. after the last line of the code inside-for-loop, perform increment operation ++)
         *  5. Go to top verify the condition (i<5)----> 1<5 = true;
         *  6. If result of the condition is true, Jave will enter the for-loop and execute the code
         *  7. after the last line of the code inside-for-loop, perform increment operation ++)
         *
         */

//        for (int i=0; i<5; i++){   // for (initialization; condition; increment) {
//            System.out.println("Hello -"+ i);
//
//            //System.out.println("Hello -" + (i+1));

         // Print " Hello - " 5 times.

//            for (int i=10; i>5; i--){   // for (initialization; condition; increment)
//                System.out.println("Hello -"+ i);
//

               // String [] names= {"Happy","New","Joy","Laugh"};
//                for (int i=0; i<=names.length-1; i++) {
//                System.out.println(names[i]);
//
                // Print the values present in even index  (0,2, 4,6,8.....)

//              for(int i=0; i<names.length;i++){
//                  if(i%2==0);{
//                      System.out.println(names[i]);
//                   }
 //                 }





            // ENHANCED FOR LOOP:
        /**
         * When you need traverse any array
         * for array type of data
         * starts from 0 and go 1 by 1
         * not jumped ...
         * Syntex:
         * for (datatype var: arrayName){
         *      var
         *      }
         */
//
//        String [] names = {"Happy","New","Joy","Laugh"};
//        for (String name: names){
//            System.out.println(" Print the line number from 71 " + name);
//        }
//
//        int [] ssn = {1111,2222, 3333, 4444, 5555};
//        for (int ssnNum: ssn){
//            System.out.println(ssnNum);
//        }

       // Print the numbers from 10 to 1

        int[] num = {10, 9,8,7,6,5,4,3,2,1};
        for(int ab : num){
            System.out.println(ab);
        }


        // WHILE LOOP:
        /**
         * Int J=0
         * while (condition) {
         * code to run
         * until the code is true
         * Increment / decrement operation
         * }
         */


        int J=0;   // Print Hello 5 times;
        while (J<5){
            System.out.println("Hello from line 100");
            J++;
        }



        }


    }

