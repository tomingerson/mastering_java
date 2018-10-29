package session9.refactor;

/**
 * @author Created by ergouser on 23.10.18.
 */
public class Country extends Identifiable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
