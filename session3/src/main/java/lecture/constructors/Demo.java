package lecture.constructors;

/**
 * This class demos the use of constructors.
 * overloading, default, this
 *
 * @author Created by tom on 18.09.2018.
 */
public class Demo {

    private final Long value;

    public Demo() {
        this(1L);
        System.out.println("default constructor");
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
