// Define the Employee interface
interface Employee {
    public String getDetails();
}

// Define the Manager interface
interface Manager extends Employee {
    public String getDeptDetails();
}

// Define the Head class that implements the Manager interface
class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;

    // Constructor to initialize the employee details
    public Head(int empId, String empName, int deptId, String deptName) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    // Implement the getDetails() method from the Employee interface
    @Override
    public String getDetails() {
        return "Employee ID: " + this.empId + ", Employee Name: " + this.empName;
    }

    // Implement the getDeptDetails() method from the Manager interface
    @Override
    public String getDeptDetails() {
        return "Department ID: " + this.deptId + ", Department Name: " + this.deptName;
    }

    // Print all the details of the employee
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println(getDetails());
        System.out.println("Department Details:");
        System.out.println(getDeptDetails());
    }
}

// Main class to test the Head class
public class Question7 {
    public static void main(String[] args) {
        Head head = new Head(1, "John Doe", 101, "IT");
        head.printDetails();
    }
}