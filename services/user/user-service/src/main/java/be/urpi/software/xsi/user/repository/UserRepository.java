package be.urpi.software.xsi.user.repository;

import be.urpi.software.xsi.core.model.api.repository.BaseModelRepository;
import be.urpi.software.xsi.user.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by daniel on 15/09/16.
 */
@Repository
public interface UserRepository extends BaseModelRepository<User> {
    User findOneByUsername(String username);
}
