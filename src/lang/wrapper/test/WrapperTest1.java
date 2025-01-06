package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        //문제1
        String str1 = "10";
        String str2 = "20";

        int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println("두 수의 합 = " + sum);

        //문제2
        String[] array = {"1.5", "2.5", "3.0"};

        double sumDouble = 0;
        for (String s : array) {
            sumDouble += Double.parseDouble(s);
        }

        System.out.println("sumDouble = " + sumDouble);
    }
}
