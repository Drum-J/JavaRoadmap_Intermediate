package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // Deprecated
        System.out.println("newInteger = " + newInteger); //출력엔 문제 없으나 미래에 삭제 예정

        Integer integer = Integer.valueOf(10); // 이걸 사용해라, -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        System.out.println("integer = " + integer);

        Integer integer1 = 10; // 이렇게 사용해도 된다. 오토박싱 (기본형 -> 래퍼클래스)
        System.out.println("integer1 = " + integer1);

        Long l = Long.valueOf(100);
        Double v = Double.valueOf(10.5);
        System.out.println("Long = " + l);
        System.out.println("Double = " + v);

        //내부 값 읽기
        int intValue = integer.intValue(); //언박싱(래퍼클래스 -> 기본형)
        System.out.println("intValue = " + intValue);

        System.out.println("\n비교");
        System.out.println("==: " + (newInteger == integer));
        // Integer.value()로 생성할 경우 자주 사용하는 값을 재사용 하기 때문에 == 비교도 true
        System.out.println("==: " + (integer1 == integer));
        System.out.println("equals: " + (newInteger.equals(integer)));
    }
}
