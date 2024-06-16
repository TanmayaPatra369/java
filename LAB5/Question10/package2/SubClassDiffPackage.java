package Question10.package2;

// SubClassDiffPackage.java


import Question10.package1.ClassOne;

public class SubClassDiffPackage extends ClassOne {
    public void display() {
        System.out.println("Accessing variables from subclass in a different package:");
        System.out.println("Public variable: " + publicVariable);
        System.out.println("Protected variable: " + protectedVariable);
        // System.out.println("Default variable: " + defaultVariable); // Cannot access default variable
        // System.out.println("Private variable: " + privateVariable); // Cannot access private variable
    }
}