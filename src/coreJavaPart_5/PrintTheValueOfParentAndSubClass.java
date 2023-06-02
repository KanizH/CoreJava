package coreJavaPart_5;

public class PrintTheValueOfParentAndSubClass {
    public static void main(String[] args) {
        // create the object of subclass
       ChildClassOverrideMethod childClassOverrideMethod = new ChildClassOverrideMethod();
       //call the method of child or sub class.
       childClassOverrideMethod.displayInfo();
       // create an object of parent class
       ParentClassWithDisplayMethod parentClassWithDisplayMethod= new ParentClassWithDisplayMethod();
       //call the method of the parent class
       parentClassWithDisplayMethod.displayInfo();

       childClassOverrideMethod.addingNumbers();

       parentClassWithDisplayMethod.addingNumbers();

    }

}
