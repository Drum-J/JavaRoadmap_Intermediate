package nested.test.ex1;

public class AnonymousMain {
    public static void main(String[] args) {
        // 여기에서 Hello의 익명 클래스를 생성하고 hello()를 호출해라.

        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };
        hello.hello();

        //람다로 표현
        Hello hello1 = () -> System.out.println("Hello.hello1");
        hello1.hello();
    }
}
