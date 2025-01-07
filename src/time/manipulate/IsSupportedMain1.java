package time.manipulate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE); //UnsupportedTemporalTypeException
        System.out.println("minute = " + minute);
    }
}
