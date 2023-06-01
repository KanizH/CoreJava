package coreJavaPart_4;

import java.util.ArrayList;

public class ArrayListSetMethodDemo {
    /*
     * Declare an arraylist
     * add the elements
     * print the values
     * update the value by calling the index number and adding the updated value
     *
     * */
    public static void main(String[] args) {
        ArrayList<String> carsName = new ArrayList<>();

        carsName.add("BMW");
        carsName.add("Ford");
        carsName.add("Mazda");


        System.out.println("Cars name: " +carsName);
        carsName.set(2, "Audi");
        System.out.println("Updated cars name : "+ carsName);
    }
}
