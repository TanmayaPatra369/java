//Program showing scope and lifetime of a variable

public class ScopeAndLifetimeExample {
    public static void main(String[] args) {
        int globalVariable = 10; // global variable

        if (true) {
            int blockVariable = 20; // block variable
            System.out.println("Global variable in if block: " + globalVariable);
            System.out.println("Block variable in if block: " + blockVariable);
        }

        System.out.println("Global variable in main method: " + globalVariable);
        // System.out.println("Block variable in main method: " + blockVariable); // error: blockVariable is not accessible outside its block

        for (int i = 0; i < 3; i++) {
            int loopVariable = 30; // loop variable
            System.out.println("Global variable in for loop: " + globalVariable);
            System.out.println("Loop variable in for loop: " + loopVariable);
        }

        // System.out.println("Loop variable in main method: " + loopVariable); // error: loopVariable is not accessible outside its block

        class InnerClass {
            int innerVariable = 40; // inner class variable
            public void printVariables() {
                System.out.println("Global variable in inner class: " + globalVariable);
                System.out.println("Inner class variable in inner class: " + innerVariable);
            }
        }
        InnerClass inner = new InnerClass();
        inner.printVariables();
    }
}