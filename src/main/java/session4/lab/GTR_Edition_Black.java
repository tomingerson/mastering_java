package session4.lab;


/**
 * The Black Edition of a GT-R.
 *
 * @author Created by tom on 18.09.2018.
 */
class GTR_Edition_Black implements INissanGTREdition {

    private final String color = "Black";
    private final Integer horsePower = 570;
    private final Integer torque = 637;

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsepower() {
        return this.horsePower;
    }

    @Override
    public Integer getTorque() {
        return this.torque;
    }
}
