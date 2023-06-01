package coreJavaPart_5;

public class CallTheOverLoadedMethod {
    public static void main(String[] args) {
        MethodOverLoading declareTwoMethodWithSameName = new MethodOverLoading();
        //calling display method without parameterized
        declareTwoMethodWithSameName.display();
        // calling the display method with the String parameter
        declareTwoMethodWithSameName.display("I am from string parameter method");
        // calling the display method with the integer parameter
        declareTwoMethodWithSameName.display(500);

    }
}
