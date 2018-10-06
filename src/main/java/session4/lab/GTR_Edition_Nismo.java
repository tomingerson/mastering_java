package session4.lab;


/**
 * The NISMO Edition of a GT-R.
 *
 * @author Created by tom on 18.09.2018.
 */
class GTR_Edition_Nismo implements INissanGTREdition {

    private final String color = "White";
    private final Integer horsePower = 600;
    private final Integer torque = 652;

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
