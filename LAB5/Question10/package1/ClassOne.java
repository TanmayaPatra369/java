package Question10.package1;

// ClassOne.java

public class ClassOne {
    public int publicVariable = 10;
    protected int protectedVariable = 20;
    int defaultVariable = 30;
    private int privateVariable = 40;
    
    public void display() {
        System.out.println("Public variable: " + publicVariable);
        System.out.println("Protected variable: " + protectedVariable);
        System.out.println("Default variable: " + defaultVariable);
        System.out.println("Private variable: " + privateVariable);
    }
}