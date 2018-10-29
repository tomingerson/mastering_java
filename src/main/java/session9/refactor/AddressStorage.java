package session9.refactor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Created by ergouser on 23.10.18.
 */
public class AddressStorage {
    private Map<Long, Address> storage = new HashMap<>();

    public void insert(Address address) {
        storage.put(address.getId(), address);
    }

    public Address loadById(Long id) {
        return storage.get(id);
    }

    public void delete(Address address) {
        storage.remove(address.getId());
    }
}
