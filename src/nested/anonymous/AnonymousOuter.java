package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        //선언 및 생성, 인터페이스인 Printer 를 바로 생성 하면서 메서드를 작성했다.
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass()); //class nested.anonymous.AnonymousOuter$1
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
