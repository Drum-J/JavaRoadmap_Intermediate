package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //change() 메서드 내부 동작을 모르면 사이드 이펙트가 어디서 발생하는지 파악하기 어렵다.
        change(b,"대구");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
