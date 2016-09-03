package be.urpi.software.xsi.services.project.service.impl;

import be.urpi.software.xsi.services.project.model.ProjectAR;
import be.urpi.software.xsi.services.project.repository.ProjectRepository;
import be.urpi.software.xsi.services.project.service.api.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by daniel on 9/2/16.
 */
@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public ProjectAR create(ProjectAR projectAR) {
        return projectRepository.save(projectAR);
    }
}
