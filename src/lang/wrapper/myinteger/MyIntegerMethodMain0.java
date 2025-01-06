package lang.wrapper.myinteger;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;
        int compare = compareTo(value, 5);
        int compare1 = compareTo(value, 10);
        int compare2 = compareTo(value, 20);
        System.out.println("compare = " + compare);
        System.out.println("compare1 = " + compare1);
        System.out.println("compare2 = " + compare2);
    }

    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
