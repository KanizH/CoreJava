package coreJavaPart_4;

import java.util.ArrayList;

public class ArrayListRemoveMethosDemo {
    public static void main(String[] args) {
        ArrayList<String> carsName = new ArrayList<>();

        carsName.add("BMW");
        carsName.add("Ford");
        carsName.add("Mazda");


        System.out.println("Cars name: " +carsName);
        // if we want print the removed value we can store in a variable.
        String removedCarName = carsName.remove(0);

        System.out.println("Cars name after removing : "+ carsName);

        System.out.println("Cars name that was removed : "+ removedCarName);
    }
}
