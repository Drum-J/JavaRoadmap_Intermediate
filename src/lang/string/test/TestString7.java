package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        // 코드 작성
        String[] split = email.split("@");
        String id = split[0];
        String domain = split[1];

        System.out.println("ID: " + id);
        System.out.println("Domain: " + domain);
    }
}
