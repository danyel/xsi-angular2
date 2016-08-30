package be.urpi.software.xsi.services.project.command.api;

import be.urpi.software.xsi.services.project.cqrs.api.command.CreateProject;

/**
 * Created by daniel on 27/08/16.
 */
public interface ProjectCommandHandler {
    void handle(CreateProject createProject);
}
