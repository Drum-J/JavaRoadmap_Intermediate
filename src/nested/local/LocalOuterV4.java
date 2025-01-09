package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1; //지역 변수는 스택 프레임이 종료되는 순간 함게 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value= " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar= " + paramVar); //parameter도 지역변수 이다.

                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        //만약 localVar의 값을 변경한다면? 다시 캡처해야 하나??
        //localVar = 10; // print() 메서드에서 컴파일 오류가 난다.
        //paramVar = 20;

        return new LocalPrinter();
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);

        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
