package lang.wrapper.test;

/**
 * 오토 박싱/언박싱을 사용하지 않고 변환
 */
public class WrapperTest2 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer 변환
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        // Integer -> int 변환
        int intValue = integer1.intValue();
        System.out.println("intValue = " + intValue);

        // int -> Integer 변환
        Integer integer2 = Integer.valueOf(intValue);
        System.out.println("integer2 = " + integer2);
    }
}
