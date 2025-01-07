package time.manipulate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        //포맷팅: 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.of(2025, 1, 7, 15, 25, 30);
        System.out.println("now = " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDateTime = now.format(formatter);
        System.out.println("날짜와 시간 포맷팅: " + formattedDateTime);

        //파싱: 문자를 날짜와 시간으로
        String input = "2025-01-07 15:27:30";
        LocalDateTime parsedDateTime = LocalDateTime.parse(input, formatter);
        System.out.println("문자열 파싱 날짜와 시간: " + parsedDateTime);
    }
}
