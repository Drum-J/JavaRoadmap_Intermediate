package lang.string.test;

public class TestString8 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        // 코드 작성
        String[] split = fruits.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        String join = String.join("->", split);
        System.out.println("join = " + join);
    }
}
