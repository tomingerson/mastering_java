package session3.lecture.coupling_cohesion;


/**
 * Types of engines for the Nissan GT-R.
 * Added the color of the car to represent editions.
 *
 * @author Created by tom on 18.09.2018.
 */
class GTR_Edition {
    private static final GTR_Edition DEFAULT = new GTR_Edition("Orange", 570, 637);
    private static final GTR_Edition BLACK = new GTR_Edition("Black", 570, 637);
    private static final GTR_Edition PRESTIGE = new GTR_Edition("Dark Orange", 570, 637);
    private static final GTR_Edition TRACK = new GTR_Edition("Blue", 570, 637);
    private static final GTR_Edition NISMO = new GTR_Edition("White", 600, 652);

    final String color;
    final Integer horsePower;
    final Integer torque;

    /**
     * Creates a new enum for an GT-R using Color, Horsepower and Torque as parameters
     *
     * @param horsePower this engines given horse power
     * @param torque     this engines given torque
     */
    private GTR_Edition(final String color, final Integer horsePower,
                        final Integer torque) {
        this.color = color;
        this.horsePower = horsePower;
        this.torque = torque;
    }
}
