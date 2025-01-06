package lang.system;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽는다.
        Map<String, String> getenv = System.getenv();
        System.out.println("getenv = " + getenv);

        // 시스템 속성을 읽는다.
        Properties properties = System.getProperties();
        System.out.println("properties = " + properties);
        System.out.println("Java version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originArray, 0, copiedArray, 0, originArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray); // 참조값 출력
        System.out.println("Arrays.toString() = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        // 테스트를 위해 10을 입력, 정상 종료일 경우 상태 코드 0. 해당 코드는 가급적 사용하지 않는것이 좋다.
        System.exit(10); // Process finished with exit code 'status'
        System.out.println("exit Test"); // 출력 안됨
    }
}
