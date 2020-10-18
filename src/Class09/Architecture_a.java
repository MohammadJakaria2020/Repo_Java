package Class09;

public class Architecture_a {
    /**all the methods in Methods will be here except the Main Method.
     * In this lesson. we will create a Class - Architecture and create all methods here
     * and Then create another class myMain - and link this two by creating object
     */

    // Field variables:
    int windows = 14;
    String houseName = "My House";
    int doors = 4;
    int rooms = 7;

    /**
     * Create methods :
     * <access-modifier> [static] <datatype of return variable|void> <method name > <blank / datetype varName 1,
     * * datetype varName 2 >
     */

    // Method to give user the option to change windows count:
    /**We don't use STATIC as per syntex , when use the method as an object
     */

    public void changeWindowsCount(int newCount) {
        windows = newCount;
    }
    // Method to return the windows count to the user
    //the user has no input to give

    public int getWindowsCount (){
        return windows;
    }


}
