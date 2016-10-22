package be.urpi.software.xsi.request.repository;

import be.urpi.software.xsi.request.model.RequestQueryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by daniel on 14/09/16.
 */
@Repository
public interface RequestQueryModelRepository extends JpaRepository<RequestQueryModel, UUID> {
}
