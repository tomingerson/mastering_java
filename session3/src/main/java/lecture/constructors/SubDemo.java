package lecture.constructors;

/**
 * @author Created by tom on 18.09.2018.
 */
public class SubDemo extends Demo {

    private final Long subValue;

    public SubDemo() {
        this.subValue = 5L;
    }

    public SubDemo(boolean initDemo) {
        this(5L, initDemo);
    }

    public SubDemo(Long subValue) {
        this(subValue, false);
    }

    public SubDemo(Long subValue, boolean initDemo) {
        super();
        this.subValue = subValue;
    }

    public SubDemo(Long value, Long subValue) {
        super(value);
        this.subValue = subValue;
    }

    /**
     * @return the stored value
     */
    public Long getSubValue() {
        return subValue;
    }
}
