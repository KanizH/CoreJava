package coreJavaPart_4;

public class ForEachLoopDemo {

    /*
    * Declare an array.
    * Execute for each loop.
    * Inside the parentheses convert the loop into int loop variable.
    * Print all the values of array
   
    * */

    public static void main(String[] args) {
        // an array
        int [] arrayNumbers = {3,100,5,-5,0,12};
        for (int loopNumbers : arrayNumbers){
            System.out.println(loopNumbers);
        }
    }
}
