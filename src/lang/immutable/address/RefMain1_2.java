package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울"); //x001
        Address b = new Address("서울"); //x002


        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("대구"); //b의 값만 대구로 변경
        System.out.println("대구 -> b");
        System.out.println("a = " + a); // a의 값은 변경되지 않음. 사이드 이펙트 발생 X
        System.out.println("b = " + b);
    }
}
