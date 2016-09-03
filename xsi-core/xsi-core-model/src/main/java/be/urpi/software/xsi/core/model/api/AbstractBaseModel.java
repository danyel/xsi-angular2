package be.urpi.software.xsi.core.model.api;

import be.urpi.software.xsi.core.model.api.sequence.UuidSequence;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by daniel on 9/1/16.
 */
@MappedSuperclass
public abstract class AbstractBaseModel implements BaseModel<UUID> {
    @Id
    @Column(name = "uuid", nullable = false, updatable = false, unique = true, length = 36)
    @Access(value = AccessType.FIELD)
    @GenericGenerator(name = "sequence_dep_id", strategy = UuidSequence.NAME)
    @GeneratedValue(generator = "sequence_dep_id")
    private UUID id;

    @Override
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
