package Class09;

public class MathLibrary {

/* * <access-modifier> [static] <dataTpe-of-the-returnedValue | void> <methodName>(blank|
 * <dataType><varName1>, <dataType><varName2>){
 */

/**
 *  * create generic methods to:
 *  * add two int numbers
 *  * sub two int numbers
 *  * multiple two int numbers
 *  * divide two int numbers
 */
    int result =0;

    public int addTwoInt1(int num1, int num2) {
//        result = num1+num2;
//        return  result;
        return num1 + num2;
    }

    // sub two numbers
    public double subTwo(int num1, double num2){
       return  num1-num2;
    }

    public double divTwo (double num1, double num2){
        double result =0;
        if (num2!=0) {
           result= num1/num2;
        }
        return  result;
    }

}