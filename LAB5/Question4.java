class Parent {
    void display() {
        System.out.println("Inside Parent class");
    }
}

interface MyInterface {
    void myMethod();
}


class Child extends Parent implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Inside MyInterface method");
    }
}

public class Question4 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.myMethod();
    }
}