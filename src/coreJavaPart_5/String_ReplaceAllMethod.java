package coreJavaPart_5;

public class String_ReplaceAllMethod {
    public static void main(String[] args) {
        //Declare a string variable
        String text1 = "Java123is456Fun";

        //regex for sequence of the string
        String regex= "\\d+";

        // replace all characters of numbers bt space
        System.out.println(text1.replaceAll(regex,"  "));
    }
}
