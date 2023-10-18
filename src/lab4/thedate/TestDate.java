package lab4.thedate;

public class TestDate {
    public static void main(String[] args) {
        // Test constructor and toString()
        Date date1 = new Date(1, 2, 2014);
        System.out.println(date1);

        // Test setter and getter
        date1.setMonth(12);
        date1.setDay(9);
        date1.setYear(2099);
        System.out.println(date1);
    }

}
