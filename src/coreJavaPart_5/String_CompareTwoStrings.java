package coreJavaPart_5;

public class String_CompareTwoStrings {
    public static void main(String[] args) {
        //Create three strings
        String firstVariable = "java ";
        String secondVariable = "Programing ";
        String thirdVariable = "java ";

        //Compare the first variable with the second variable by using the equal method
        boolean result1= firstVariable.equals(secondVariable);
        System.out.println("First and second string are equal: "+ result1);

        //Compare the first variable with the third variable by using the equal method
        boolean result2= firstVariable.equals(thirdVariable);
        System.out.println("First and second string are equal: "+ result2);
    }
}
