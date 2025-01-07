package time.period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        //생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        //계산에 사용
        LocalDate localDate = LocalDate.of(2025, 1, 7);
        LocalDate plusDays = localDate.plus(period);
        System.out.println("localDate = " + localDate);
        System.out.println("plusDays = " + plusDays);

        //기간 차이
        LocalDate startDate = LocalDate.of(2024, 10, 20);
        LocalDate endDate = LocalDate.now();
        Period between = Period.between(startDate, endDate);
        System.out.println("기간: " + between.getMonths() + "개월 " + between.getDays() + "일");
    }
}
