package enumeration.ex1;

/**
 * StringGrade.XXX 같은 상수를 사용하더라도 여전히 문제는 해결되지 않는다.
 * DiscountService.discount(String,int)
 * discount() 메서드는 String 을 받고 있기 때문이다.
 */
public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10_000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        //오타
        int gald = discountService.discount("GALD", price);
        System.out.println("GALD 등급의 할인 금액: " + gald);

        //소문자
        int diamond = discountService.discount("Diamond", price);
        System.out.println("Diamond 등급의 할인 금액: " + diamond);
    }
}
