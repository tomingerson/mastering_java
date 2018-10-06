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
        return false;
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

class Weekday {
    public static final Weekday MONDAY = new Weekday("MONDAY", 1);
    public static final Weekday TUESDAY = new Weekday("TUESDAY", 2);
    public static final Weekday WEDNESDAY = new Weekday("WEDNESDAY", 3);
    public static final Weekday THURSDAY = new Weekday("THURSDAY", 4);
    public static final Weekday FRIDAY = new Weekday("FRIDAY", 5);
    public static final Weekday SATURDAY = new Weekday("SATURDAY", 6);
    public static final Weekday SUNDAY = new Weekday("SUNDAY", 0);

    private String name;
    private int index;

    private Weekday(String name, int index) {
        this.name = name;
        this.index = index;
    }

    String name() {
        return this.name;
    }

    int ordinal() {
        return this.index;
    }

    static Weekday[] values() {
        return new Weekday[]{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
                SATURDAY};
    }
}