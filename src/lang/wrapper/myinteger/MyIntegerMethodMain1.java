package lang.wrapper.myinteger;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger integer = new MyInteger(10);
        int compare = integer.compareTo(5);
        int compare1 = integer.compareTo(10);
        int compare2 = integer.compareTo(20);

        System.out.println("compare = " + compare);
        System.out.println("compare1 = " + compare1);
        System.out.println("compare2 = " + compare2);
    }
}
