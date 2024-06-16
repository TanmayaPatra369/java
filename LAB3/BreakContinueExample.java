public class BreakContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; 
            }
            System.out.println(i);
            if (i == 5) {
                break; // Stop the loop when i is 5
            }
        }
    }
}