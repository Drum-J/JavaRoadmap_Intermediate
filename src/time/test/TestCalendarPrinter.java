package time.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            writer.write("년도를 입력하세요: ");
            writer.flush();
            int year = Integer.parseInt(reader.readLine());

            writer.write("월을 입력하세요: ");
            writer.flush();
            int month = Integer.parseInt(reader.readLine());

            String calender = printCalender(year, month);
            writer.write(calender);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String printCalender(int year, int month) {
        LocalDate inputMonth = LocalDate.of(year, month, 1);
        LocalDate nextMonth = inputMonth.plusMonths(1);

        //월요일 1 ... 일요일 7
        int offsetWeekDays = inputMonth.getDayOfWeek().getValue() % 7;

        StringBuilder sb = new StringBuilder();
        sb.append("Su Mo Tu We Th Fr Sa").append("\n");
        sb.append("   ".repeat(Math.max(0, offsetWeekDays))); // 시작 요일에 맞춰 띄우기

        LocalDate dayIterator = inputMonth;
        while (dayIterator.isBefore(nextMonth)) {
            sb.append(String.format("%2d ", dayIterator.getDayOfMonth()));

            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                sb.append("\n");
            }
            dayIterator = dayIterator.plusDays(1);
        }

        return sb.toString();
    }
}
