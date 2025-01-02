package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("대구"); //불변 객체에는 setter 메서드가 없다.
        b = new ImmutableAddress("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // record 클래스를 사용해서 불변 객체를 생성
        RecordAddress recordAddress1 = new RecordAddress("서울");
        RecordAddress recordAddress2 = new RecordAddress("부산");

        System.out.println("recordAddress1 = " + recordAddress1);
        System.out.println("recordAddress2 = " + recordAddress2);
    }
}
