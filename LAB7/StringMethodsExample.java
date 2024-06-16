public class StringMethodsExample {
    public static void main(String[] args) {


         //startsWith() and endsWith()
         string str = "hello world";
         boolean starts = str.startswith("hello");
         boolean ends = str.endswith("world");
         System.out.println("starts with" +starts);
         System.out.p

        // compareTo()
        String str3 = "apple";
        String str4 = "banana";
        int compareToResult = str3.compareTo(str4);
        System.out.println("compareTo Result: " + compareToResult);

        // regionMatches()
		        String str1 = "Hello World";
		        String str2 = "Hello";
		        boolean regionMatchResult = str1.regionMatches(0, str2, 0, 5);
		        System.out.println("regionMatches Result: " + regionMatchResult);

		// indexOf()
		        int index1 = str.indexOf('o');
		        int index2 = str.indexOf("World");
		        System.out.println("Index of 'o': " + index1);
                System.out.println("Index of 'World': " + index2);


    }
}

































































































