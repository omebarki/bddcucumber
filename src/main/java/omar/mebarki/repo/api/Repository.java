package omar.mebarki.repo.api;

/**
 * Created by Omar MEBARKI on 25/06/2015.
 */
public interface Repository {
    void save(PersistentObject persistentObject);

    void delete(Long objectId);

    PersistentObject findById(Long objectId);
}
