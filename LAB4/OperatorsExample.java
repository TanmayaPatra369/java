public class OperatorsExample {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        // Bitwise AND
        int resultAnd = a & b;
        System.out.println("Bitwise AND: " + resultAnd);

        // Bitwise OR
        int resultOr = a | b;
        System.out.println("Bitwise OR: " + resultOr);

        // Bitwise XOR
        int resultXor = a ^ b;
        System.out.println("Bitwise XOR: " + resultXor);

        // Bitwise NOT
        int resultNotA = ~a;
        System.out.println("Bitwise NOT of a: " + resultNotA);

        // Left Shift
        int leftShiftResult = a << 2;
        System.out.println("Left Shift of a by 2: " + leftShiftResult);

        // Right Shift
        int rightShiftResult = a >> 1;
        System.out.println("Right Shift of a by 1: " + rightShiftResult);

        // Ternary Operator
        String message = (a > b) ? "a is greater than b" : "b is greater than or equal to a";
        System.out.println("Ternary Operator: " + message);
    }
}