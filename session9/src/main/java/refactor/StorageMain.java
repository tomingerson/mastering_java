package refactor;

/**
 * @author Created by ergouser on 23.10.18.
 */
public class StorageMain {
    public static void main(String[] args) {
        PersonStorage personStorage = new PersonStorage();
        CountryStorage countryStorage = new CountryStorage();
        AddressStorage addressStorage = new AddressStorage();

        Person p = new Person();
        p.setId(1L);
        p.setFirstName("Peter");
        p.setLastName("Shaw");
        personStorage.insert(p);

        Person personToDelete = new Person();
        personToDelete.setId(2L);

        personStorage.delete(personStorage.loadById(p.getId()));
    }
}
