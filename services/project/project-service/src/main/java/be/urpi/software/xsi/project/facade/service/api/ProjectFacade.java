package be.urpi.software.xsi.project.facade.service.api;

import be.urpi.software.xsi.project.facade.dto.Project;
import be.urpi.software.xsi.project.facade.service.command.CreateProject;

/**
 * Created by daniel on 27/08/16.
 */
public interface ProjectFacade {
    Project create(CreateProject createProject);
}
