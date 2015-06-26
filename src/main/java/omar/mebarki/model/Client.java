package omar.mebarki.model;

import omar.mebarki.repo.api.PersistentObject;

/**
 * Created by Omar MEBARKI on 25/06/2015.
 */
public class Client implements PersistentObject {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
