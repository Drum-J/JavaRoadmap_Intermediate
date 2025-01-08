package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        //InnerOuter.Inner(); // static inner class와 달리 이렇게 생성되지 않음

        //바깥 클래스의 인스턴스(outer)를 먼저 생성해야 내부 클래스의 인스턴스(inner)를 생성할 수 있다.
        InnerOuter.Inner inner = outer.new Inner(); //이렇게 생성해야 한다.
        inner.print();

        InnerOuter.Inner inner1 = new InnerOuter().new Inner(); // 이렇게도 가능

        System.out.println("inner.getClass() = " + inner.getClass());
    }
}
