package session3.lab;


/**
 * The Default Edition of a GT-R.
 *
 * @author Created by tom on 18.09.2018.
 */
class GTR_Edition_Default  implements NissanGTREdition {

    private final String color = "Orange";
    private final Integer horsePower = 570;
    private final Integer torque = 637;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsepower() {
        return horsePower;
    }

    @Override
    public Integer getTorque() {
        return torque;
    }
}
