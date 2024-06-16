class Apple {
    public void show() {
        System.out.println("This is the show() method of Apple class");
    }
}

class Banana extends Apple {
    @Override
    public void show() {
        System.out.println("This is the show() method of Banana class");
    }
}

class Cherry extends Apple {
    @Override
    public void show() {
        System.out.println("This is the show() method of Cherry class");
    }
}

public class Fruits {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

        // Dynamic Method Dispatch
        Apple fruit1 = new Banana();
        Apple fruit2 = new Cherry();

        apple.show();
        banana.show();
        cherry.show();

        // Dynamic Method Dispatch to call show() of Banana and Cherry
        fruit1.show();
        fruit2.show();
    }
}