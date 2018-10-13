package session4.lab;

/**
 * @author Created by tom on 06.10.2018.
 * @link https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 */
class WeekdayCheck {

    final Weekday day;

    public WeekdayCheck(final Weekday day) {
        this.day = day;
    }

    public static boolean isWeekend(final Weekday day) {
        return (day == Weekday.SATURDAY || day == Weekday.SUNDAY);
    }

    public String check() {
        String message;
        switch (day.ordinal()) {
            case 1:
                message = "Mondays are bad :-(";
                break;
            case 5:
                message = "Fridays are better :-)";
                break;
            case 0:
            case 6:
                message = "Weekends are best :-D";
                break;
            default:
                message = "Midweek days are so-so :-|";
                break;
        }
        return message;
    }
}

enum Weekday {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}