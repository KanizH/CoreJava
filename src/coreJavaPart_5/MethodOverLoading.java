package coreJavaPart_5;

public class MethodOverLoading {
    //method without parameter
    public void display() {
        for (int i = 0; i < 100; i++) {System.out.println("I am from without parameter method");
        }
    }

    //method with parameters
    public void display(String text) {
        for(int i=0; i<100; i++) {System.out.println(text);
        }
    }

     // method with integer parameters
     public void display (int number){
         for(int i=0; i<100; i++) {System.out.println(number);


     }
    }

}