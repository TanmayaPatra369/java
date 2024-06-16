import java.util.*;

public class StringBufferFunctionsDemo {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Java is my favorite Programming Language");

        // a. append()
        stringBuffer.append(" - Java");
        System.out.println("append() example: " + stringBuffer);

        // b. insert()
        stringBuffer.insert(0, "This is an ");
        System.out.println("insert() example: " + stringBuffer);

        // c. delete()
        stringBuffer.delete(0, 15);
        System.out.println("delete() example: " + stringBuffer);

        // d. ensureCapacity()
        stringBuffer.ensureCapacity(100);
        System.out.println("ensureCapacity() example: " + stringBuffer);

        // e. capacity()
        int capacity = stringBuffer.capacity();
        System.out.println("capacity() example: " + capacity);

        // f. reverse()
        stringBuffer.reverse();
        System.out.println("reverse() example: " + stringBuffer);
    }
}