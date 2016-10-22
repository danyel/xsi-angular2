package be.urpi.software.xsi.user.service.api;

import be.urpi.software.xsi.user.model.Role;

import java.util.List;

/**
 * Created by daniel on 15/09/16.
 */
public interface RoleService {
    List<Role> findAll();
}
