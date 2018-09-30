package session3.lecture.constructors;

/**
 * @author Created by tom on 21.09.2018.
 */
public class Abort {

    private Long value;
    private boolean allowNegativeValue;

    public Abort(final Long value) throws Exception {
        this(value, true);
    }

    public Abort(final Long value, boolean allowNegativeValue) throws Exception {
        if (value == null) {
            throw new Exception("value must not be null");
        }
        if (!allowNegativeValue && value < 0L) {
            throw new IllegalArgumentException("parameter value must not be negative");
        }

        this.value = value;
        this.allowNegativeValue = allowNegativeValue;
    }
}
