package HomeWorks;

import org.w3c.dom.ls.LSOutput;

public class Homework_06 {

    public static void main(String[] args) {
        int[] numbers = {10, 10, 20, 20};
        double avgArrNum = arrayAvg(numbers);  // Using arrayAvg
        System.out.println("print from line # 7 : " + avgArrNum);

        int[] numbers1 = {20, 20, 20, 20};
        double avgArrNum01 = arrAvg01(numbers1);
        System.out.println("Print Line # 12 : " + avgArrNum01);

        String [] allNames = {"John", "michael", "ghilipppre", "philip", "ilena", "palena", "fahry"};
        String yourName= "Philip";
        int findName= findNameIndex(allNames, yourName);
        System.out.println("Print from the line # 19 for the method line#69 : " + findName); // Pls see line 69.


    }

    // Crate a method to find average of an int-array
    //How to create a Method:
    /**
     * Syntex:
     * <access-modifier> [static] <dataTpe-of-the-returnedValue | void> <methodName>(blank|
     * <dataType><varName1>, <dataType><varName2>){
     */

        public static double arrayAvg(int[] arr) {
        double avg = 0.00;
        double sum = 0.00;
        // using Enhanced For Loop -- >
        for (int num : arr) {    // enhanced for Loop ---> for (datatype var: arrName){
            sum += num;           //  var
        }                       // }
        return sum / arr.length;
    }
    // create the average int of  array by using for Loop:
        public static double arrAvg01(int[] arr) {
        double avg = 0.00;
        double sum = 0.00;
        // Using For Loop ---- >
        for (int i = 0; i < arr.length; i++) {  // for (initialization; condition; increment) {
            sum = sum + arr[i];                 // code
        }                                       // }
        int count = arr.length;
        return sum / count;
    }

        // String [] names= {"John", "michael", "ghilipppre", "philip", "ilena", "palena", "fahry"};
        // String nameToSearch= "philip";
        // Create a method that will print the index of given name in the given array.

    //Syntex:
    // * <access-modifier> [static] <dataTpe-of-the-returnedValue | void> <methodName>(blank|
    // * <dataType><varName1>, <dataType><varName2>){

//        String [] allNames = {"John", "michael", "ghilipppre", "philip", "ilena", "palena", "fahry"};
//        String yourName= "Philip";
//        int findName= findNameIndex(allNames, yourName);

        public static int findNameIndex (String [] names, String nameToSearch){  // if no return - use VOID
            int nameIndex=-1;
            for (int i=0; i<names.length; i++){
                if (names[i].equalsIgnoreCase(nameToSearch)){
                    nameIndex=i;
                    //System.out.println(nameToSearch + " is at index: "+ i);
                    break;
                }
            }
            return nameIndex;  // this will return the index number.
        }








}




