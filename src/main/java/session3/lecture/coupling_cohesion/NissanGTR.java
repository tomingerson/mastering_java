package session3.lecture.coupling_cohesion;

/**
 * @author Created by tom on 18.09.2018.
 */
public class NissanGTR {

    private GTR_Edition edition;

    /**
     * Creates a new Nissan GT-R edition.
     *
     * @param edition the edition to use
     */
    public NissanGTR(GTR_Edition edition) {
        this.edition = edition;
    }

    /**
     * @return this cars horse power
     */
    Integer getHorsepower() {
        return edition.horsePower;
    }

    String getColor() {
        return edition.color;
    }
}
}
