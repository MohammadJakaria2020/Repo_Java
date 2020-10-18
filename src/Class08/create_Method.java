package Class08;

import org.w3c.dom.ls.LSOutput;

public class create_Method {
    /**
     * Syntex;
     * <access-modifier> [static] <datatype of return variable|void> <method name > <blank / datetype varName 1,
     * datetype varName 2 >
     */
    public static void main(String[] args) {
//           String name= "Happy";
//           name.toUpperCase();
//           name.charAt(0)  ;

        int a = 100;
        int b = 200;
        int ab = addTwoInt(100, 200);
        System.out.println("Print line # 19 : " + ab);

        int res = addTwoInt(10, 20);
        System.out.println("Print line # 20 : " + res);

        double resDiv= divTwoNum(20,10);
        System.out.println("Print line # 24: " + resDiv);

        int abc = 100;
        double bcd = 50.0;
        double result= divTwoNum1(abc,bcd);
        System.out.println("for method line -52  " + result);

        //  Average of an int array:

        int[] values = {11, 22, 33, 44, 55};
        double findTheAvg=arrAverage(values);
        System.out.println("Line 31 ---> " + findTheAvg);

        String [] allNames= {"John", "michael", "ghilipppre", "philip", "ilena", "palena", "fahry"};
        String nameToSearch= "philip";

        // The que is in below
        // find the index of the name philips

        int findTheName= findNameIndex(allNames,nameToSearch);
        System.out.printf("findtheName in thw line 42 " + findTheName);
    }

    // Crating a method to add two numbers:
        public static int addTwoInt(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    // Creating a method to divide the two numbers:
      public static double divTwoNum(int num1, int num2) {
      double divResult=num1/num2;
      return divResult;
    }

    // Divide method:
    public static double divTwoNum1(int num1, double num2) {
        double result = 0;
        if (num2 != 0) {
            result = num1 / num2;
        }
        return result;

    }
   // Create a method to find average of an int array
    // This is the Homework # 6 , which Deeopak explain in the next class
    // Please see HomeWork 6

        public static double arrAverage (int[]arr) {
            double sum = 0;
            double avg = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            return sum / arr.length;
        }

        //  Create a method that will print the index of given name in the given array.
//        String [] allNames= {"John", "michael", "ghilipppre", "philip", "ilena", "palena", "fahry"};
//        String nameToSearch= "philip";

        public static int findNameIndex (String[] allNames, String  nameToSearch){
        int nameindex1=-1;
        for (int i = 0; i<allNames.length;i++){
            if (allNames[i].equalsIgnoreCase(nameToSearch)){
                nameindex1=i;
               // System.out.println("line 86" + i);
                break;
            }
        }

        return nameindex1;
           //System.out.println("line 88" + nameindex1);
     }
}








