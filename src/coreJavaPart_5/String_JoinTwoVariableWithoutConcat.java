package coreJavaPart_5;

public class String_JoinTwoVariableWithoutConcat {
    public static void main(String[] args) {
        //Declare first string variable
        String firstVariable = "java ";
        System.out.println("First Variable: "+ firstVariable);

        //Declare second string variable
        String secondVariable = "Programing ";
        System.out.println("Second Variable: "+ secondVariable);


        String withoutConcatString = firstVariable+secondVariable;

        System.out.println("After plus operator: "+withoutConcatString);
    }
}
