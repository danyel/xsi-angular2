package be.urpi.software.xsi.services.project.service.impl;

import be.urpi.software.xsi.core.cqrs.api.event.notify.EventNotifier;
import be.urpi.software.xsi.services.project.cqrs.api.command.CreateProject;
import be.urpi.software.xsi.services.project.cqrs.api.event.ProjectCreated;
import be.urpi.software.xsi.services.project.model.ProjectAR;
import be.urpi.software.xsi.services.project.service.api.ProjectManagementService;
import be.urpi.software.xsi.services.project.service.api.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by daniel on 27/08/16.
 */
@Service
public class ProjectManagementServiceImpl implements ProjectManagementService {
    private final ProjectService projectService;
    private final EventNotifier eventNotifier;

    @Autowired
    public ProjectManagementServiceImpl(ProjectService projectService, EventNotifier eventNotifier) {
        this.projectService = projectService;
        this.eventNotifier = eventNotifier;
    }

    @Override
    public void create(CreateProject createProject) {
        ProjectAR projectAR = ProjectAR.builder()
                .withName(createProject.getName())
                .build();
        projectService.create(projectAR);
        eventNotifier.notify(ProjectCreated
                .builder()
                .withUuid(projectAR.getId())
                .build());
    }
}
