package hw3.moreexcersises;

public class DateUtil {

    // Month's name - for printing
    public static String[] strMonths = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    // Number of days in each month (for non-leap years)
    public static int[] daysInMonths = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    /*
     * Returns true if the given year is a leap year
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Return true if the given year, month, day is a valid date
     * year: 1-9999
     * month: 1(Jan) - 12(Dec)
     * day: 1 - 28|29|30|31. The last day depends on year and month
     */
    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1) {
            return false;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }
        return day <= daysInMonths[month-1];
    }

    /*
     * Return the day of the week, 0: Sun, 1: Mon, ..., 6: Sat
     */
    public static int getDayOfWeek(int year, int month, int day) {

        int century = 6; // Century code for 2000-2099

        int lastTwoDigitsOfYear = year % 100;
        int yearCode = lastTwoDigitsOfYear + lastTwoDigitsOfYear/4;

        int monthCode = 0;
        switch(month) {
            case 1: monthCode = 0; break;
            case 2: monthCode = 3; break;
            case 3: monthCode = 3; break;
            case 4: monthCode = 6; break;
            case 5: monthCode = 1; break;
            case 6: monthCode = 4; break;
            case 7: monthCode = 6; break;
            case 8: monthCode = 2; break;
            case 9: monthCode = 5; break;
            case 10: monthCode = 0; break;
            case 11: monthCode = 3; break;
            case 12: monthCode = 5; break;
        }

        int total = (century + yearCode + monthCode + day) % 7;

        return total;
    }

    /*
     * Return String "xxxday d mmm yyyy" (e.g., Wednesday 29 Feb 2012)
     */
    public static String printDate(int year, int month, int day) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};

        int dayOfWeek = getDayOfWeek(year, month, day);

        return days[dayOfWeek] + " " + day + " " + strMonths[month-1] + " " + year;
    }

    public static void main(String[] args) {

        // Tests here
        // Test isLeapYear()
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(2004)); // true
        System.out.println(isLeapYear(2011)); // false

// Test isValidDate()
        System.out.println(isValidDate(2012, 2, 29)); // true
        System.out.println(isValidDate(2011, 2, 29)); // false
        System.out.println(isValidDate(2099, 12, 31)); // true
        System.out.println(isValidDate(2099, 12, 32)); // false
        System.out.println(isValidDate(2020, 4, 31)); // false

// Test getDayOfWeek()
        System.out.println(getDayOfWeek(1982, 4, 24)); // 6: Sat
        System.out.println(getDayOfWeek(2000, 1, 1)); // 6: Sat
        System.out.println(getDayOfWeek(2012, 2, 17)); // 5: Fri
        System.out.println(getDayOfWeek(2025, 3, 14)); // 6: Sat

// Test printDate()
        System.out.println(printDate(2012, 2, 14)); // Tuesday 14 Feb 2012
        System.out.println(printDate(2025, 12, 25)); // Thursday 25 Dec 2025

    }

}