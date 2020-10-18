package Class09;

public class Calculations {
    public static void main(String[] args) {
        MathLibrary m1= new MathLibrary();
        int sum=  m1.addTwoInt1(10,20);

        System.out.println("Line 8 = " + m1.addTwoInt1(10,20)); // direct print
        System.out.println("Line 9 : = " + sum);

        double subResult= m1.subTwo(20,10);
        System.out.println("Print line 12 = " + subResult);

        double divideRes= m1.divTwo(20,10);
        System.out.println("Print line 15 : " + divideRes);

    }

}

