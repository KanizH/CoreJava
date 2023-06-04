package coreJavaPart_5;

public class String_SplitMethod {
    public static void main(String[] args) {
        //declare a string variable
        String text = "Java is a fun language";

        //Split string from space
        String [] result = text.split(" ");

        //Declare a for each loop to print the values of the array
        for (String arrayText:result){
            System.out.println(arrayText+", ");
        }



    }
}
