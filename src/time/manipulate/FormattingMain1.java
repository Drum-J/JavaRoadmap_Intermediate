package time.manipulate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        //포맷팅: 날짜를 문자로
        LocalDate date = LocalDate.of(2025, 1, 7);
        System.out.println("date = " + date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = date.format(formatter);
        System.out.println("날짜 포맷팅 = " + formattedDate);

        //파싱: 문자를 날짜로
        String input = "2025년 01월 07일"; //'MM월 dd일' 형식이라 '01월 07일'로 해야함.
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("문자열 날짜 파싱 = " + parsedDate);
    }
}
