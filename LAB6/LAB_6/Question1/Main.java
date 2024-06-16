import java.util.Scanner;
import marketing.Sales;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee id and emploee name");
        int empid = scanner.nextInt();
        String ename = scanner.next();
        System.out.println("Enter the basic salary");
        double basic = scanner.nextDouble();
        Sales sales = new Sales(empid, ename);
        sales.printDetails();
       System.out.println( sales.earnings(basic));
    }
}
