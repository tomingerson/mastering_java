package session3.lab;


/**
 * The NISMO Edition of a GT-R.
 *
 * @author Created by tom on 18.09.2018.
 */
class GTR_Edition_Nismo  implements NissanGTREdition {

    private final String color = "White";
    private final Integer horsePower = 600;
    private final Integer torque = 652;


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
