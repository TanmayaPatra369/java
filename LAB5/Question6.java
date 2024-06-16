import java.util.Scanner;

interface Employee {
    double BASIC_SALARY = 50000;
    double DA_PERCENTAGE = 0.8;
    double HRA_PERCENTAGE = 0.15;
    double PF_PERCENTAGE = 0.12;

    double earnings();
    double deductions();
    double bonus();
}

class Manager implements Employee {
    public double earnings() {
        return BASIC_SALARY + BASIC_SALARY * DA_PERCENTAGE + BASIC_SALARY * HRA_PERCENTAGE;
    }

    public double deductions() {
        return BASIC_SALARY * PF_PERCENTAGE;
    }

    public double bonus() {
        // Manager class does not implement the bonus() method
        throw new UnsupportedOperationException("Manager class does not implement the bonus() method");
    }
}

class Substaff extends Manager {
    @Override
    public double bonus() {
        return BASIC_SALARY * 0.5;
    }
}

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double BASIC_SALARY = scanner.nextDouble();

        Employee employee = new Substaff();
        double earnings = employee.earnings();
        double deductions = employee.deductions();
        double bonus = employee.bonus();

        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);

        scanner.close();
    }
}