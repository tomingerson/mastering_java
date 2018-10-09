package session4.lab;

/**
 * Enumeration of all possible editions.
 *
 * @author Created by ergouser on 09.10.18.
 */
public enum NissanGTREditions implements INissanGTREdition {
    BLACK("Black"), DEFAULT("Orange"), NISMO("White", 600, 652), PRESTIGE("Dark Orange"), TRACK("Blue");

    private final String color;
    private final Integer horsePower;
    private final Integer torque;

    NissanGTREditions(String color, Integer horsePower, Integer torque) {
        this.color = color;
        this.horsePower = horsePower;
        this.torque = torque;
    }

    NissanGTREditions(String color) {
        this.color = color;
        this.horsePower = 570;
        this.torque = 637;
    }

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
