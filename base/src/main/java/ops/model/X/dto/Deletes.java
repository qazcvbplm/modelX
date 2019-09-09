package ops.model.X.dto;

import java.io.Serializable;
import java.util.Set;

public class Deletes implements Serializable {

    private Set<Long> ids;

    public Set<Long> getIds() {
        return ids;
    }

    public void setIds(Set<Long> ids) {
        this.ids = ids;
    }
}
