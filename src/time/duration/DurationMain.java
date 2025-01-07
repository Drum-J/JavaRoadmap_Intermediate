package time.duration;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        //생성
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        //계산에 사용
        LocalTime localTime = LocalTime.of(1, 0);
        System.out.println("localTime = " + localTime);

        LocalTime plusTime = localTime.plus(duration);
        System.out.println("더한 시간: " + plusTime);

        //시간 차이
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration between = Duration.between(start, end);
        System.out.println("차이: " + between.getSeconds() + "초");
        System.out.println("근무 시간: " + between.toHours() + "시간 " + between.toMinutesPart() + "분");
        System.out.println("근무 시간: " + between.toMinutes() + "분");

    }
}
