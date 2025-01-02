package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj obj = new ImmutableObj(10);
        ImmutableObj add = obj.add(20);

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj = " + obj.value()); //기존값
        System.out.println("add = " + add.value()); //신규값
    }
}
