// Define the interface
interface MyInterface {
    void myMethod();
}

// Define a class that implements the interface
class MyChildClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("MyChildClass's implementation of myMethod()");
    }

    public void myOtherMethod() {
        System.out.println("MyChildClass's implementation of myOtherMethod()");
    }
}

public class Question8 {
    public static void main(String[] args) {
        // Create a reference variable of the interface type
        MyInterface myRef;

        // Point the reference variable to an object of the child class
        myRef = new MyChildClass();

        // Call the method defined in the interface
        myRef.myMethod();

        // This will cause a compile-time error because myRef is of the interface type
        // myRef.myOtherMethod();

        // To call the method defined in the child class, you need to cast the reference variable to the child class type
        MyChildClass myChildRef = (MyChildClass) myRef;
        myChildRef.myOtherMethod();
    }
}