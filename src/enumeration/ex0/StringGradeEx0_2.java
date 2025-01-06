package enumeration.ex0;

public class StringGradeEx0_2 {
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
