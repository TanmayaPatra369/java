package marketing;

import general.Employee;

public class Sales extends Employee {
    public Sales(int empid, String ename) {
        super(empid, ename);
    }

    public double tallowance() {
        double earnings = super.earnings(5000);
        double tallowance = 0.05 * earnings;
        return tallowance;
    }

    public void printDetails() {
        System.out.println("The emp id of the employee is " + getEmpid());
        System.out.println("The total allowance is " + tallowance());
    }
}

