package enumeration.ref2;

import static enumeration.ref2.Grade.*;

public class EnumRefMain1 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        int price = 10000;

        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
