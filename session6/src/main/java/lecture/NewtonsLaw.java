package lecture;

/**
 * <em>Newton's Law of motion</em> states, that the net force on an object is equal
 * to the objects mass multiplied by the objects acceleration.
 *
 * @author Created by tom on 13.10.2018.
 */
public class NewtonsLaw {

    private NewtonsLaw() {
    }

    /**
     * Caclulates the Force on an object using Newton's law
     *
     * @param mass         the objects mass; must not be null
     * @param acceleration the objects acceleration; must not be null
     * @return the calculated force on the object
     */
    public static Double calculateForce(final Double mass, final Double acceleration) {
        return mass * acceleration;
    }

    /**
     * Calculates the Acceleration of an object given its mass and applied force using
     * Newton's Law.
     *
     * @param force the force applied on the object; must not be null
     * @param mass  the objects mass; must not be null
     * @return the calculated acceleration
     */
    public static Double calculateAcceleration(final Double force, final Double mass) {
        return force / mass;
    }

    /**
     * Why is there no JavaDoc?
     */
    public static Double calculateMass(final Double force, final Double acceleration) {
        return force / acceleration;
    }

}
