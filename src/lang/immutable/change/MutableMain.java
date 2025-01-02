package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);

        //계산 이후의 기존 값은 사라짐. 기존 value = 10이었는데 add(20) 이후 value = 30으로 바뀐다는 말.
        System.out.println("obj = " + obj.getValue());
    }
}
