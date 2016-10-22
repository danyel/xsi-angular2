package be.urpi.software.xsi.core.model.api;

import java.io.Serializable;

/**
 * Created by daniel on 9/1/16.
 */
public interface BaseModel<S extends Serializable> {
    S getId();
}
