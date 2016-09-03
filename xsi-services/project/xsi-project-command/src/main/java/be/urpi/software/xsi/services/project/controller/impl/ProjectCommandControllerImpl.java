package be.urpi.software.xsi.services.project.controller.impl;

import be.urpi.software.xsi.services.project.controller.api.ProjectCommandController;
import be.urpi.software.xsi.services.project.cqrs.api.command.CreateProject;
import be.urpi.software.xsi.services.project.service.api.ProjectManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by daniel on 27/08/16.
 */
@Controller
@RequestMapping(value = "/project")
public class ProjectCommandControllerImpl implements ProjectCommandController {
    private ProjectManagementService projectManagementService;

    @Autowired
    public ProjectCommandControllerImpl(ProjectManagementService projectManagementService) {
        this.projectManagementService = projectManagementService;
    }

    @Override
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void doPost(@RequestBody CreateProject createProject) {
        projectManagementService.create(createProject);
    }
}
