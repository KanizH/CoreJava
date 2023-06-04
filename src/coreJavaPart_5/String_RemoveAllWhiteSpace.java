package coreJavaPart_5;

public class String_RemoveAllWhiteSpace {
    public static void main(String[] args) {
        //Declare two variables
        String text1= "Learn    Java    Programming  ";
        //Replace all thr white spaces with blank double quotes
        String result = text1.replaceAll("\\s", " @ ");
        //Print the value
        System.out.println(result);
    }
}
