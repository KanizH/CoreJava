package coreJavaPart_5;

public class String_JoinTwoVariables {
    public static void main(String[] args) {
        //Declare first string variable
        String firstVariable = "java ";
        System.out.println("First Variable: "+ firstVariable);

        //Declare second string variable
        String secondVariable = "Programing ";
        System.out.println("Second Variable: "+ secondVariable);

        //Join two string with concat method
        String joinedString = firstVariable.concat(secondVariable);
        System.out.println("After joining the second string: "+ joinedString);

        //Declare third variable
        String thirdVariable = "Language";
        System.out.println("Third Variable: "+ thirdVariable);

        //Join the third variable with joinedString variable
        String againjoinedString = joinedString.concat(thirdVariable);
        //Print the value
        System.out.println("After joining third string: "+ againjoinedString);

    }
}
