package be.urpi.software.xsi.services.project.controller.api;

import be.urpi.software.xsi.services.project.cqrs.api.command.CreateProject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by daniel on 27/08/16.
 */
public interface ProjectCommandController {
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    void doPost(@RequestBody CreateProject createProject);
}
