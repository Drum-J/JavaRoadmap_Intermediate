package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java ");
        }

        String result = sb.toString();
        //String result = "Hello Java".repeat(100000); // 위 코드를 이렇게 줄일 수 있다.
        System.out.println("result = " + result);

        long endTime = System.currentTimeMillis();
        System.out.println("time = " + (endTime - startTime) + "ms"); //17ms
    }
}
