package session3.lab;


/**
 * The Black Edition of a GT-R.
 *
 * @author Created by tom on 18.09.2018.
 */
class GTR_Edition_Black implements NissanGTREdition {

    private final String color = "Black";
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
