import java.util.Scanner;

public class StringFunctionsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // a. join()
        String joinExample = inputString.join();
        System.out.println("join() example: " + joinExample);

        // b. isEmpty()
        boolean isEmptyExample = inputString.isEmpty();
        System.out.println("isEmpty() example: " + isEmptyExample);

        // c. replace()
        String replaceExample = inputString.replace("a", "x");
        System.out.println("replace() example: " + replaceExample);

        // d. split()
        String[] splitExample = inputString.split(" ");
        for (String word : splitExample) {
            System.out.println("split() example: " + word);
        }

        // e. subString()
        String subStringExample = inputString.substring(0, 1);
        System.out.println("substring() example: " + subStringExample);
    }
}