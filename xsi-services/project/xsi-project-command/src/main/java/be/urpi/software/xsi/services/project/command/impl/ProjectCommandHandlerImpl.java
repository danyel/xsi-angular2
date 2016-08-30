package be.urpi.software.xsi.services.project.command.impl;

import be.urpi.software.xsi.core.cqrs.api.event.notify.EventNotifier;
import be.urpi.software.xsi.services.project.command.api.ProjectCommandHandler;
import be.urpi.software.xsi.services.project.cqrs.api.command.CreateProject;
import be.urpi.software.xsi.services.project.cqrs.api.event.ProjectCreated;
import be.urpi.software.xsi.services.project.model.ProjectAR;
import be.urpi.software.xsi.services.project.service.api.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by daniel on 27/08/16.
 */
@Service
@Transactional
public class ProjectCommandHandlerImpl implements ProjectCommandHandler {
    private final EventNotifier eventNotifier;
    private final ProjectService projectService;

    @Autowired
    public ProjectCommandHandlerImpl(EventNotifier eventNotifier, ProjectService projectService) {
        this.eventNotifier = eventNotifier;
        this.projectService = projectService;
    }

    @Override
    public void handle(CreateProject createProject) {
        ProjectAR projectAR = ProjectAR.builder()
                .withName(createProject.getName())
                .build();
        projectService.save(projectAR);
        eventNotifier.notify(ProjectCreated.builder()
                .withUuid(projectAR.getUuid())
                .build());
    }
}
