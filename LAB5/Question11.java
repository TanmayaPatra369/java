	  	class OuterClass {
    private int outerData = 10;

    // Inner class within OuterClass
    class InnerClass {
        void displayInner() {
            System.out.println("Inner class method: " + outerData);
        }
    }

    // Method in OuterClass to instantiate and use InnerClass
    void useInnerClass() {
        InnerClass inner = new InnerClass();
        inner.displayInner();
    }
}

public class Question11 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.useInnerClass();
    }
}