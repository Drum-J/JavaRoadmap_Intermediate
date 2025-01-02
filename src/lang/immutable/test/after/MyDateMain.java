package lang.immutable.test.after;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2024, 1, 1);
        MyDate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        date1 = date1.changeYear(2025);
        //date1 = date1.changeYear(2025).changeMonth(12).changeDay(31);
        //date1 = date1.changeDate(2025, 12, 31);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
