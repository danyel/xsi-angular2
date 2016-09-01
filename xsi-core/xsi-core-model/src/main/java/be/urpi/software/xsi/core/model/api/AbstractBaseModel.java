package be.urpi.software.xsi.core.model.api;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by daniel on 9/1/16.
 */
@MappedSuperclass
public abstract class AbstractBaseModel<S extends Serializable> implements BaseModel<S> {
    @Id
    private S id;

    @Override
    public S getId() {
        return id;
    }

    public void setId(S id) {
        this.id = id;
    }
}
