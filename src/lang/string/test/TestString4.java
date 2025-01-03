package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        // 코드 작성 indexOf()를 반복문과 함께 사용해야 한다.
        int count = 0;
        int index = str.indexOf(key);
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count = " + count);

        /*
        String[] split = str.split(",");

        for (String s : split) {
            if (s.contains(key)) {
                count++;
            }
        }
        */
    }
}
