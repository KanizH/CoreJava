package coreJavaPart_4;

import java.util.ArrayList;

public class DifferenceBetweenArrayandArrayListDemo {
    /*
     * Create an single dimensional array
     * Execute for each loop to print the values
     * Try to add or change the value from the array we can't do that until create a new array or manipulate the first array
     * But in the arraylist after creating we can add, update, get, delete from anywhere of the class
     *
     * */
    public static void main(String[] args) {
        // an array
        int [] arrayNumbers = {3,100,5,-5,0,12};
        for (int loopNumbers : arrayNumbers) {
            System.out.println(loopNumbers);
        }
        // an arrayList
        ArrayList<Integer> vehicleModelNumber = new ArrayList<>();

        vehicleModelNumber.add(20);
        vehicleModelNumber.add(50);
        vehicleModelNumber.add(30);

        System.out.println(vehicleModelNumber);

    }

}

