package lang.string.test;

public class TestString3 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        // 코드 작성
        int index = str.indexOf(ext);

        String fileName = str.substring(0, index);
        String extName = str.substring(index);

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
