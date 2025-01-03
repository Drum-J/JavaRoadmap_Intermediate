package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result);

        //모두 참조값이 똑같다! this 를 반환하기 때문
        System.out.println("adder = " + adder);
        System.out.println("adder1 = " + adder1);
        System.out.println("adder2 = " + adder2);
        System.out.println("adder3 = " + adder3);

        //value 로 확인해보자
        System.out.println("adder.getValue() = " + adder.getValue());
        System.out.println("adder1.getValue() = " + adder1.getValue());
        System.out.println("adder2.getValue() = " + adder2.getValue());
        System.out.println("adder3.getValue() = " + adder3.getValue());
    }
}
