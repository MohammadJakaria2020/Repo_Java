package HomeWorks;

import java.util.Arrays;

public class Homework_03 {
    public static void main(String[] args) {

     //String  statement = "There could be any value, task is to find the lenght of the last word in the statement";
        /* Code
        String lastWord= "";
        Find out the length of the last statement?

        sout -- > "Last word in the statement is " + lastWord + " ; = " + length variable;
         */

        /* Action plan:
        1. Split the string by space into string array.
        2. Find the length of the last word.
        3. Print accordingly.
         */

       String statement = "There could be any value, task is to find the lenght of the last word in the statement";

       // String statement = "Hello World";

       // Solution #1 :

        int lastSpaceIndex = statement.lastIndexOf(" ");
        String lastWord= statement.substring(lastSpaceIndex+1);
        int lenLastWord= lastWord.length();
        System.out.println(lenLastWord);

        //Solution #2 :
        // Que: String statement = "There could be any value, task is to find the lenght of the last word in the statement";
        String [] splitStatement = statement.split(" ");
        int lenOfSplitStatement= splitStatement.length;  // Length of array = array.length;
        String lastWord1= splitStatement[lenOfSplitStatement-1];  // ASK DEEPAK :
        int lenOfLastWord = lastWord1.length();
        System.out.println(lenOfLastWord);

        //System.out.println(Arrays.toString(splitStatement));

        // HOMEWORK  3 : DATED SEP 24, 2020 (CLASS 09)
        // QUE #1
        /* Store your  full name in  a variable and display the followings :
        1. Display length of the first name
        2. Does your last name starts with "K" (Ignore case)
        3. Print the last aplhabat of your first name
        4. Does your last name ensds with "N" (Ignore case);
         */

       String myName= "Mohammad Jakaria";
       String [] splitName= myName.split(" ");  // "Mohammad" , "Jakaria"
       String firstName= splitName [0];
       String lastName= splitName[1];

       //1. Length of your first name
        int firstNameLen= firstName.length();
        System.out.println("Lenght of my first name is = " + firstNameLen);
        //2. Does your last name starts with 'K'

        boolean lastNameStarts_K= lastName.toUpperCase().startsWith("k");
        System.out.println("MY last name starts with K = " + lastNameStarts_K);

        // 3. Print out the last alphabet of your first name;

       int firstNameLastInx= firstNameLen-1;
       char firstNameLastChar = firstName.charAt(firstNameLastInx);
       System.out.println("Last alphabat of the first name is = " +firstNameLastChar);

       // 4.  Does your last name ensds with "N" (Ignore case);

        Boolean lastNameEnd_N= lastName.toUpperCase().endsWith("N");
        System.out.println("Does last name ends with N = " + lastNameEnd_N);


        // Q2: String myStatement= " I am a good programmer';
          /*   Using the string method to do the following task:
                1. Display the total number of words in the myStatement
                2. replace all the 'r' characteristics with 'f' character;
           */

        String myStatement = "I am a good programmer";
        String [] wordsCount  = myStatement.split(" ");
        int noOfWords= wordsCount.length;
        System.out.println(" Total number of words in the statement - I am a good programmer is = " + noOfWords);

        // Replace all the 'r' characters  with 'f' characters

        String myStatReplace= myStatement.replace('r','f');
        System.out.println("Replacing all 'r' with 'f' = " + myStatReplace);

        // Q3: Store your name in a String variable;
        /* calculate the length of your name w/o using length() method of string class.
         */

     String [] nameSplit=  firstName.split("");
     int nameLen= nameSplit.length;
        System.out.println("Lenght of my name w/o using the string class = " + nameLen);


        //  Q4: String threeWordSentence = "hApPY nEW yeAr";
            /* sout (HNW)
             */

        String threeWordSentence = "hApPY nEW yeAr";
        String wordUpperCase=  threeWordSentence.toUpperCase();
        String []  wordSplit = wordUpperCase.split(" ");
        String word1= wordSplit[0];
        String firstWord=  word1.substring(0,1);

        String word2= wordSplit[1];
        String secondWord=  word2.substring(0,1);

        String word3= wordSplit[2];
        String thirdWord=  word3.substring(0,1);

        System.out.println("The abbreviation for Happy New year is = " + (firstWord+secondWord+thirdWord));


        /* Recap: String statement = "Hello World, I am good";
        Find out the length of last word.
         */

        String stat= "Hello World, I am goodman";
        String [] statSplit= stat.split(" ");
        int wordsLen=statSplit.length;
         String lastWordStat  = statSplit[wordsLen-1];
         int lastWordLen= lastWordStat.length();
         System.out.println(lastWordLen);

         // SOLUTION  # 1

         String myNameNew= "I am Mohammad Jakaria, working in a school";
         String [] myNameNewSplit= myNameNew.split(" ");
         int myNameNewLen= myNameNewSplit.length;
         String lastNameNewWord = myNameNewSplit[myNameNewLen-1];
         int lastNameNewWordLen= lastNameNewWord.length();
        System.out.println("LAST WORD FOR THE STSTEMENT IS = " + lastNameNewWordLen);


        // Solution # 2
       int lasIndexmyNameNew=   myNameNew.lastIndexOf(" ") ;
       String lastWordmyNameNew= myNameNew.substring(lasIndexmyNameNew+1);
        int  lenLastEordmyNameNew= lastWordmyNameNew.length();
        System.out.println("LAST WORD FOR THE STSTEMENT IS (1) = " + lenLastEordmyNameNew);



        // Homework #3 Recap:

        // QUE #1
        /* Store your  full name in  a variable and display the followings :
        1. Display length of the first name
        2. Does your last name starts with "K" (Ignore case)
        3. Print the last aplhabat of your first name
        4. Does your last name ensds with "N" (Ignore case);

         */

       String myNameIs= "Mohammad Golam Jakaria";
       String [] myNameIsSplit= myNameIs.split(" ");
       String myNameFirst  =myNameIsSplit [0];
       int  lenMyNameFirst= myNameFirst.length();
        System.out.println("Length of my First name is = "+ lenMyNameFirst );


        // String = "hAPpy NeW YEar";
        // Sout ( HNY)

        String statNew= "hAPpy NeW YEar";
        String [] staNewSplit=  statNew.split(" ");
        String name1= staNewSplit[0];
        String name2= staNewSplit[1];
        String name3= staNewSplit[2];

       /*Char nameStat1=   name1.toUpperCase().charAt('0');
       System.out.println(nameStat1);
        */

       String name1FirstAlp= name1.toUpperCase().substring(0,1);
        System.out.println(name1FirstAlp);





















    }
}
