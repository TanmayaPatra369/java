

// Main.java
package Question10;

import Question10.package1.*;
import Question10.package2.*;

public class Main {
    public static void main(String[] args) {
        ClassOne obj1 = new ClassOne();
        obj1.display();
        
        SubClassSamePackage obj2 = new SubClassSamePackage();
        obj2.display();
        
        SubClassDiffPackage obj3 = new SubClassDiffPackage();
        obj3.display();
        
        NonSubClassDiffPackage obj4 = new NonSubClassDiffPackage();
        obj4.display();
    }
}