package enumeration.ex1;

public class DiscountService {

    public int discount(String grade, int price) {
        int discountPercent = 0;

        switch (grade) {
            case StringGrade.BASIC -> discountPercent = 10;
            case StringGrade.GOLD -> discountPercent = 20;
            case StringGrade.DIAMOND -> discountPercent = 30;
            default -> System.out.println(grade + ": 할인 X");
        }

        // grade:GOLD -> 10000 * (20/100) = 2000원 할인
        return price * discountPercent / 100;
    }
}
