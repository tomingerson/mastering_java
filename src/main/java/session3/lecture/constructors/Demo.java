package session3.lecture.constructors;

/**
 * This class demos the use of constructors.
 *
 * @author Created by tom on 18.09.2018.
 */
public class Demo {

    private final Long value;

    public Demo() {
        this.value = 1L;
    }

    public Demo(Long value) {
        this.value = value;
    }

    /**
     * @return the stored value
     */
    public Long getValue() {
        return value;
    }
}
