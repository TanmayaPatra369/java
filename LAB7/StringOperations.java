import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String userString = scanner.nextLine();

        System.out.print("Enter a character: ");
        char userChar = scanner.next().charAt(0);

        // Operations
        System.out.println("1. Change case: " + changeCase(userString));
        System.out.println("2. Reverse string: " + reverseString(userString));
        System.out.println("3. Compare strings: " + compareStrings(userString, "example"));
        System.out.println("4. Insert string: " + insertString(userString, "inserted", 3));
        System.out.println("5. Convert to uppercase: " + convertToUppercase(userString));
        System.out.println("6. Convert to lowercase: " + convertToLowercase(userString));
        System.out.println("7. Character position: " + findCharacterPosition(userString, userChar));
        System.out.println("8. Palindrome check: " + isPalindrome(userString));
        int[] counts = countWordsVowelsConsonants(userString);
        System.out.println("9. Number of words: " + counts[0]);
        System.out.println("   Number of vowels: " + counts[1]);
        System.out.println("   Number of consonants: " + counts[2]);

        scanner.close();
    }

    public static String changeCase(String str) {
	        return str.equals(str.toUpperCase()) ? str.toLowerCase() : str.toUpperCase();
	    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static String insertString(String mainStr, String insertStr, int position) {
        return mainStr.substring(0, position) + insertStr + mainStr.substring(position);
    }

    public static String convertToUppercase(String str) {
        return str.toUpperCase();
    }

    public static String convertToLowercase(String str) {
        return str.toLowerCase();
    }

    public static int findCharacterPosition(String str, char ch) {
        return str.indexOf(ch);
    }

    public static boolean isPalindrome(String str) {
	        String reversed = reverseString(str);
	        return str.equalsIgnoreCase(reversed);
    }

    public static int[] countWordsVowelsConsonants(String str) {
	        int words = str.split("\\s+").length;
	        int vowels = 0;
	        int consonants = 0;
	        str = str.toLowerCase();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }
	        return new int[]{words, vowels, consonants};
	    }
}