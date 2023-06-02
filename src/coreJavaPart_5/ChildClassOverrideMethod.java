package coreJavaPart_5;

//sub class
public class ChildClassOverrideMethod extends ParentClassWithDisplayMethod{
    // override the displayInfo method from parent class
    @Override
    public  void displayInfo(){
        System.out.println("I am from the child class");
    }

    // override the addingNumbers method from parent class
    @Override
    public void addingNumbers(){
        double number1 = 200.50;
        double number2 = 500.20;
        double result = number1 - number2;
        System.out.println(result);
    }
}
