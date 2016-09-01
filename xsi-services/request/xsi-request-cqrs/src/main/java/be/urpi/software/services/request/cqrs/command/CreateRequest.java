package be.urpi.software.services.request.cqrs.command;

import be.urpi.software.xsi.core.cqrs.api.command.Command;

/**
 * Created by daniel on 9/1/16.
 */
public class CreateRequest implements Command {
    private String name;
    private String project;

    public String getName() {
        return name;
    }

    public String getProject() {
        return project;
    }
}
