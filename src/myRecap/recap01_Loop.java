package myRecap;

public class recap01_Loop {
    public static void main(String[] args) {

        // LOOP CLASSES ------
        // USING THE FOR LOOP

//        String[] names = {"Happy", "Peace", "Joy", "Laugh"};
//        for (int i=0; i<=names.length-1; i++){
//            System.out.println(names[i]);
//        }

        /** Print the values in even index (0,2,4,6,8 .....)
         * using for Loop
         * Code
         * Sout
         */
        String[] myName = {"Mohammad", "Golam", "Jakaria"};
        for (int i = 0; i <= myName.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Print from the line # 21 = " + myName[i]);
            }
        }

        // Example : Enhanced for Loop

        int[] ssn = {111, 222, 333, 444};
        for (int i = 0; i < ssn.length; i++) {
            System.out.println(" Print from line 30 = " + ssn[i]);
        }

        int[] ssn1 = {111, 222, 333, 444, 555};
        for (int ssnNew : ssn1) {
            System.out.println("Print from line 35 = " + ssnNew);
        }
        // Print numbers form 10 to 1
        // Using Enhanced for Loop

        int [] numbers = {10, 9,8,7, 6, 5,4,3,2,1 };
        for (int numCount:numbers){
            System.out.println("Print from the line 42 = " + numCount);
        }


        //  WHILE LOOP:
        /** Syntex:
         * int j=0;
         *  while (condition) {
         *     // code to run
         *      //until condition is true
         *      increment / decrement operation
         *      }
         */

        // Print Hello 5 times;

        int j=0;
        while (j<5){
            System.out.println("Print from line 59 = Hello");
            j++;
        }


        // QUE: Print all values from array using - 1. for Loop 2. enhanced for loop and 3. while Loop

        // FOR LOOP
        char [] alphabets1 = {'A', 'B','C','D','E','F','G'};
        for (int i=0; i< alphabets1.length; i++) {
            System.out.println("Print form the Line#70 = " + alphabets1[i]);
        }

        // ENHANCED FOR LOOP
        char [] alphabets2 = {'A', 'B','C','D','E','F','G'};
        for(char alphaCount : alphabets2){
            System.out.println("Print from the line#n76 = " + alphaCount);
        }

        // Using: While Loop
        char [] alphabets3 = {'A', 'B','C','D','E','F','G'};
        int a=0;
        while(a<alphabets3.length){
            System.out.println("Print from the line 83 = " + alphabets3[a]);
            a++;
        }

        // Write a code to print the reverse a given string "happy"

//        String Word= "happy";
//        String []wordSplits= Word.split(""); // "h", "a", "p", "p", "y"
//       // int  newWordLen=newWordSplit.length;
//        for (int i=0; i<wordSplits.length; i++) {
//            String newWordSplit = wordSplits[i];
//            String reverseNewWord = "";
//            for (int k = newWordSplit.length() - 1; k >= 0; k--) {
//                reverseNewWord = reverseNewWord + newWordSplit.charAt(k)+ "";
//            }
//
//            //reversedString = reversedString + reverseNewWord + "";
//       // }
//
//
//              //char   reverseNewWord1= reverseNewWord + newWordSplit.charAt('k');}
//
//
//                System.out.println("Print line# 98 = " + reverseNewWord);

        // ???????????????????????????????
//            }
//
//
//
//        }

        //System.out.println("Print line# 98 = " + reverseNewWord1);



//        String[] words = str.split(" ");
//        String reversedString = "";
//        for (int i = 0; i < words.length; i++)
//        {
//            String word = words[i];
//            String reverseWord = "";
//            for (int j = word.length()-1; j >= 0; j--)
//            {
//                /* The charAt() function returns the character
//                 * at the given position in a string
//                 */
//                reverseWord = reverseWord + word.charAt(j);



       // int findLastIndex=newWord.length;
//        String reverseNewWord="";
//        System.out.println(reverseNewWord);







    }


}

