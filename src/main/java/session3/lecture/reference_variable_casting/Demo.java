package session3.lecture.reference_variable_casting;

/**
 * Class to demo reference variable casting.
 *
 * @author Created by tom on 18.09.2018.
 */
public class Demo implements IDemo {

    private Double squarePi;

    public static void main(String[] args) {
        Demo clazz = new Demo();
        clazz.getSecurityCode();
        clazz.getSquarePi();

        IDemo iface = new Demo();
        iface.getSecurityCode();
        iface.getSquarePi();

        Object obj = new Demo();
        if (obj instanceof IDemo) {
            ((IDemo) obj).getSecurityCode();
            ((IDemo) obj).getSecurityCode();
        }
        if (obj instanceof Demo) {
            ((Demo) obj).getSecurityCode();
            ((Demo) obj).getSquarePi();
        }

    }

    public void wrapperTypes() {
        final double pi = 3.14;
        final int x = (int) pi;
        final var xXx = x * pi;

        this.squarePi = xXx;
    }

    /**
     * @return the square of Pi
     */
    public Double getSquarePi() {
        return squarePi;
    }

    @Override
    public Long getSecurityCode() {
        return (long) hashCode();
    }
}
