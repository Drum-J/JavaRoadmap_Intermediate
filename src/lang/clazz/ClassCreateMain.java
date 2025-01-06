package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        //Class<Hello> helloClass = Hello.class;
        Class<?> helloClass = Class.forName("lang.clazz.Hello"); // 예외처리 필요

        Hello hello = (Hello) helloClass
                .getDeclaredConstructor() // 생성자를 선택한다
                .newInstance(); //선택한 생성자를 기반으로 인스턴스를 생성한다
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
