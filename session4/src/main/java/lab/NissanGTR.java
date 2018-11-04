package lab;

/**
 * This class represents a car of make Nissan, model GT-R in a specific edition
 * available in Europe.
 *
 * @author Created by tom on 18.09.2018.
 */
public class NissanGTR {

    private INissanGTREdition edition;

    /**
     * Creates a new Nissan GT-R edition.
     *
     * @param edition the edition to use
     */
    public NissanGTR(INissanGTREdition edition) {
        this.edition = edition;
    }

    /**
     * @return this cars horse power
     */
    Integer getHorsepower() {
        return this.edition.getHorsepower();
    }

    /**
     * @return the torque of this cars' engine
     */
    Integer getTorque() {
        return this.edition.getTorque();
    }

    /**
     * @return this cars color depending on the edition
     */
    String getColor() {
        return this.edition.getColor();
    }
}
