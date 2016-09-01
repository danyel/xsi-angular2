package be.urpi.software.xsi.services.request.repository;

import be.urpi.software.xsi.services.request.model.RequestAR;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by daniel on 9/1/16.
 */
public interface RequestRepository extends JpaRepository<RequestAR, String> {
}
