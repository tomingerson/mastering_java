package refactor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Created by ergouser on 23.10.18.
 */
public class PersonStorage {
    private Map<Long, Person> storage = new HashMap<>();

    public void insert(Person person) {
        storage.put(person.getId(), person);
    }

    public Person loadById(Long id) {
        return storage.get(id);
    }

    public void delete(Person person) {
        storage.remove(person.getId());
    }
}
