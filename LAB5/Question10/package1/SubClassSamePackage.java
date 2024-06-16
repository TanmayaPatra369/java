package Question10.package1;

// SubClassSamePackage.java

public class SubClassSamePackage extends ClassOne {
    public void display() {
        System.out.println("Accessing variables from subclass in the same package:");
        System.out.println("Public variable: " + publicVariable);
        System.out.println("Protected variable: " + protectedVariable);
        System.out.println("Default variable: " + defaultVariable);
        // System.out.println("Private variable: " + privateVariable); 
        // Cannot access private variable
    }
}