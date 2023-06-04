package coreJavaPart_5;

public class String_TrimMethodTORemoveSpaces {
    public static void main(String[] args) {
        // Create two string variables
        String text1= " !           Java Programing       .";
        String text2= "Learn\nJava Programing\n\n\n\n Language    .";

        System.out.println("Value of the string 1 without trimming: "+ text1);
        System.out.println("Value of the string 2 without trimming: "+ text2);


        //trim thr string variables
        System.out.println("After trimming the variable text1 : "+ text1.trim());
        System.out.println("After trimming the variable text1 : "+ text2.trim());
    }
}
