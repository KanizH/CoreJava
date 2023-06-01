package coreJavaPart_4;

public class WhileLoopLessThanEqualTo {
    public static void main(String[] args) {
         /* Initial an expression
        declare while loop to test the expression
         *
         */


        int i = 1;
        while (i <= 10) {
            System.out.println("Hello I am from inside the loop" + i);
            // update the expression
            i++;
            //i--; (Infinite loop)
        }

    }
}