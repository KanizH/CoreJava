package coreJavaPart_4;

public class WhileLoopUpdateFiveTimes {
    public static void main(String[] args) {
        int i= 1;
        while (i<=100){
            System.out.println("Hello I am from inside the loop" + i);
            //Update the expression
            i+=5;

        }
    }
}
