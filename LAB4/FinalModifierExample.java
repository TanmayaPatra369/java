public class FinalModifierExample {
    public static void main(String[] args) {
        // Final Variables
        final int MAX_NUM = 100;
        // MAX_NUM = 200; // error: cannot assign a value to final variable MAX_NUM

        // Final Methods
        class MyClass {
            final void myMethod() {
                System.out.println("This is a final method.");
            }
        }

        // Final Classes
        final class AnotherClass {
            int myNumber;
            AnotherClass(int num) {
                myNumber = num;
            }
            void printMyNumber() {
                System.out.println("My Number: " + myNumber);
            }
        }

        // Cannot extend AnotherClass
        // class AnotherSubClass extends AnotherClass {
        //     // ...
        // }

        MyClass obj1 = new MyClass();
        obj1.myMethod(); // This is a final method.

        AnotherClass obj2 = new AnotherClass(5);
        obj2.printMyNumber(); // My Number: 5
    }
}