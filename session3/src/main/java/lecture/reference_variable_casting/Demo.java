package lecture.reference_variable_casting;

import lecture.constructors.Abort;

/**
 * Class to demo reference variable casting.
 *
 * @author Created by tom on 18.09.2018.
 */
public class Demo implements IDemo {

    public static void main(String[] args) {
        Demo clazz = new Demo();
        clazz.getSecurityCode();
        clazz.getSquarePi();

        IDemo iface = new Demo();
        IDemo casted = clazz;
        iface.getSecurityCode();
        //iface.getSquarePi();

        Object obj = new Demo();
        //obj.getSecurityCode();
        //obj.getSquarePi();
        if (obj instanceof IDemo) {
            ((IDemo) obj).getSecurityCode();
            //((IDemo) obj).getSquarePi();
        }
        if (obj instanceof Demo) {
            Demo demo = (Demo) obj;
            demo.getSecurityCode();
            demo.getSquarePi();
        }
        System.out.println(obj instanceof Abort);
    }

    public void wrapperTypes() {

    }

    /**
     * @return the square of Pi
     */
    public Double getSquarePi() {
        final double pi = 3.14;
        final int x = (int) pi;
        final var xXx = x * pi;

        return Double.valueOf(xXx);
    }

    @Override
    public Long getSecurityCode() {
        return Long.valueOf((long) hashCode());
    }
}
