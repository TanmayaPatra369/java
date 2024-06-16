interface Motor {
    int capacity = 5;
    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing machine is running...");
    }

    public void consume() {
        System.out.println("Washing machine is consuming " + capacity + " liters of water...");
    }
}

public class Question5 {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.run();
        washingMachine.consume();
    }
}