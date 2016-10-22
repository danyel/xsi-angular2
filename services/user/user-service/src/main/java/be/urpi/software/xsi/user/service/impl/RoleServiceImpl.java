package be.urpi.software.xsi.user.service.impl;

import be.urpi.software.xsi.user.model.Role;
import be.urpi.software.xsi.user.repository.RoleRepository;
import be.urpi.software.xsi.user.service.api.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by daniel on 15/09/16.
 */
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}
