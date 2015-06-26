package omar.mebarki.repo.impl;

import omar.mebarki.repo.api.PersistentObject;
import omar.mebarki.repo.api.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Omar MEBARKI on 25/06/2015.
 */
public class RepositoryImpl implements Repository {

    private Map<Long, PersistentObject> store = new HashMap<Long, PersistentObject>();
    private AtomicLong nextId = new AtomicLong(1);

    public void save(PersistentObject persistentObject) {
        if (persistentObject.getId() == null) {
            persistentObject.setId(nextId.getAndIncrement());
        }
        store.put(persistentObject.getId(), persistentObject);
    }

    public void delete(Long objectId) {
        store.remove(objectId);
    }

    public PersistentObject findById(Long objectId) {
        return store.get(objectId);
    }
}
