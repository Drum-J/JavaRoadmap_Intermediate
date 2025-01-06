package enumeration.ref3;

public class EnumRefMain2 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        int price = 10000;

        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);

        int basic2 = Grade.BASIC.discount(price); // DiscountService 를 안거쳐도 된다
        System.out.println("basic2 = " + basic2);
    }
}
