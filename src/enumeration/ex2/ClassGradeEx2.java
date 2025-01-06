package enumeration.ex2;

public class ClassGradeEx2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        // public class 이기 때문에 인스턴스를 생성할 수 있는 문제가 있다.
        /*
        ClassGrade vip = new ClassGrade(); // 생성자를 private 으로 바꾼 이후에는 생성할 수 없다.

        int vipPrice = discountService.discount(vip, price);
        System.out.println("VIP 등급의 할인 금액: " + vipPrice);
        */
    }
}
