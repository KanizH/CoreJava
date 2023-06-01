package coreJavaPart_4;

import java.util.ArrayList;

public class ArrayListAddMethodDemo {
    /*
     * Declare an arraylist
     * add the elements
     * print the values
     */
    public static void main(String[] args) {
        //Integer type of arraylist
        ArrayList<Integer> vehicleModelNumber = new ArrayList<>();


        vehicleModelNumber.add(20);
        vehicleModelNumber.add(50);
        vehicleModelNumber.add(30);

        System.out.println(vehicleModelNumber);
    }
}
