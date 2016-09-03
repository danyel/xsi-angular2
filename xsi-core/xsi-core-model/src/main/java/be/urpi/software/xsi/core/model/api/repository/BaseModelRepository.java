package be.urpi.software.xsi.core.model.api.repository;

import be.urpi.software.xsi.core.model.api.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by daniel on 9/2/16.
 */
public interface BaseModelRepository<T extends BaseModel<UUID>> extends JpaRepository<T, UUID> {
}
