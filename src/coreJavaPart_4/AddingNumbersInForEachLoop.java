package coreJavaPart_4;

public class AddingNumbersInForEachLoop {
    /**
     * Declare an array
     * Declare a variable to assign the value = 0
     * Execute the for each loop
     * Inside the parentheses convert the loop into int variable
     * Inside the loop's body adding all the array's value with the numb variable
     * After adding the variable final result store in the numb variable that's why it updates the value.
     */

    public static void main(String[] args) {

        int [] arrayNumbers= {3,100,5,-5,0,12};
        int numb = 0;
        System.out.println("The value of numb: "+ numb);
        for (int loopNumbers:arrayNumbers){
            numb=numb+loopNumbers;
        }
        System.out.println("The value of the number after executing the loop: "+ numb);



    }
}
