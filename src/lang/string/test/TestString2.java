package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String str = "hello.txt";

        // 문제 3번
        int index = str.indexOf(".txt");
        System.out.println("index = " + index);

        // 문제 4번
        String fileName = str.substring(0, 5);
        String extName = str.substring(5);

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
