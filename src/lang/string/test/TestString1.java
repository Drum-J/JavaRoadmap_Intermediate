package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        // 문제 1번
        String url = "https://www.example.com";

        // 코드 작성
        System.out.println(url.startsWith("https://"));

        // 문제 2번
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        // 코드 작성
        int sum = 0;
        for (String s : arr) {
            sum += s.length();
            System.out.println(s + ": " + s.length());
        }
        System.out.println("sum = " + sum);
    }
}
