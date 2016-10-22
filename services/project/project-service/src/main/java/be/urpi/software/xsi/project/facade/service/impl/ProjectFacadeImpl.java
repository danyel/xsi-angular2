package be.urpi.software.xsi.project.facade.service.impl;

import be.urpi.software.xsi.project.facade.dto.Project;
import be.urpi.software.xsi.project.facade.service.command.CreateProject;
import be.urpi.software.xsi.project.model.ProjectAR;
import be.urpi.software.xsi.project.facade.service.api.ProjectFacade;
import be.urpi.software.xsi.project.service.api.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by daniel on 27/08/16.
 */
@Service
public class ProjectFacadeImpl implements ProjectFacade {
    private final ProjectService projectService;

    @Autowired
    public ProjectFacadeImpl(ProjectService projectService) {
        this.projectService = projectService;
    }

    @Override
    public Project create(CreateProject createProject) {
        ProjectAR projectAR = ProjectAR.builder()
                .name(createProject.getName())
                .build();
         projectService.create(projectAR);
        return Project.builder()
                .uuid(projectAR.getId().toString())
                .name(projectAR.getName())
                .build();
    }
}
