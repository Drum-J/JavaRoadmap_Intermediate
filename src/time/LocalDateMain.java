package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(1995, 7, 17);
        System.out.println("오늘 날짜= " + nowDate);
        System.out.println("지정 날짜= " + ofDate);

        //계산(불변)
        ofDate = ofDate.plusDays(10); //반환 받아서 사용해야 한다.
        System.out.println("지정 날짜 + 10d = " + ofDate);
    }
}
