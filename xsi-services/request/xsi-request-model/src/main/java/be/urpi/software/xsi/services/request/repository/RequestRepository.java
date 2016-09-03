package be.urpi.software.xsi.services.request.repository;

import be.urpi.software.xsi.core.model.api.repository.BaseModelRepository;
import be.urpi.software.xsi.services.request.model.RequestAR;
import org.springframework.stereotype.Repository;

/**
 * Created by daniel on 9/1/16.
 */
@Repository
public interface RequestRepository extends BaseModelRepository<RequestAR> {
}
