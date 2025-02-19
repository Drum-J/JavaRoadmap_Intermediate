package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2 = " + str1.equals(str2));

        System.out.println("'a' compareTo 'b' = "+"a".compareTo("b"));
        System.out.println("'a' compareTo 'c' = "+"a".compareTo("c"));
        System.out.println("'a' compareTo 'a' = "+"a".compareTo("a"));

        System.out.println("str1.compareTo(str3) = " + str1.compareTo(str3));
        System.out.println("str1.compareToIgnoreCase(str2) = " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 startsWith 'Hello' = " + str1.startsWith("Hello"));
        System.out.println("str1 endsWith 'Java!' = " + str1.endsWith("Java!"));

    }
}
