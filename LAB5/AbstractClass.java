import java.util.Scanner;

abstract class Student {
    int rollNo;
    long regNo;

    Student(int rollNo, long regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    abstract void course();

    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll no: ");
        rollNo = scanner.nextInt();
        System.out.print("Enter registration no: ");
        regNo = scanner.nextLong();
        scanner.close();
    }

    void display() {
        System.out.println("Roll no: " + rollNo);
        System.out.println("Registration no: " + regNo);
        course();
    }
}

class Kiitian extends Student {

    Kiitian(int rollNo, long regNo) {
        super(rollNo, regNo);
    }

    void course() {
        System.out.println("Course: B.Tech. (Computer Science & Engg)");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Kiitian kiitian = new Kiitian(0, 0);
        kiitian.getInput();
        kiitian.display();
    }
}