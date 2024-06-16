package Question10.package2;

import Question10.package1.ClassOne;

// NonSubClassDiffPackage.java


public class NonSubClassDiffPackage {
    public void display() {
        ClassOne classOne = new ClassOne();
        System.out.println("Accessing variables from non-subclass in a different package:");
        System.out.println("Public variable: " + classOne.publicVariable);
        // System.out.println("Protected variable: " + classOne.protectedVariable); // Cannot access protected variable
        // System.out.println("Default variable: " + classOne.defaultVariable); // Cannot access default variable
        // System.out.println("Private variable: " + classOne.privateVariable); // Cannot access private variable
    }
}
