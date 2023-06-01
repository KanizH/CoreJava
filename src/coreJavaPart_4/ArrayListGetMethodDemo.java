package coreJavaPart_4;

import java.util.ArrayList;

public class ArrayListGetMethodDemo {
    public static void main(String[] args) {
        ArrayList<String> carsName = new ArrayList<>();

        carsName.add("BMW");
        carsName.add("Ford");
        carsName.add("Mazda");


       System.out.println("Cars name: " +carsName);
       //
       String carBrand= carsName.get(1);
       System.out.println(carBrand);



    }
}
