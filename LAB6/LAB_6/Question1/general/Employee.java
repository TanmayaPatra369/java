package general;

public class Employee {
    protected int empid;
    private String ename;

    public Employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

    public double earnings(double basic) {
        double earnings = basic + (0.8 * basic) + (0.15 * basic);
        return earnings;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEname() {
        return ename;
    }
}