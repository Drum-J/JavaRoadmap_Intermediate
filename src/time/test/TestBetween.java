package time.test;

import java.time.LocalDate;
import java.time.Period;

import static java.time.temporal.ChronoUnit.*;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        System.out.println("시작 날짜: " + startDate);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        System.out.println("목표 날짜: " + endDate);

        //long year = YEARS.between(startDate, endDate);
        //long month = MONTHS.between(startDate, endDate);

        Period period = Period.between(startDate, endDate);

        long dDays = DAYS.between(startDate, endDate);

        System.out.println("남은 기간: " +period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일");
        System.out.println("디데이: " + dDays + "일 남음");
    }
}
