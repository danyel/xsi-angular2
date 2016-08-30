package be.urpi.software.xsi.services.project.cqrs.api.command;

import be.urpi.software.xsi.core.cqrs.api.command.Command;

/**
 * Created by daniel on 27/08/16.
 */
public class CreateProject implements Command {
    private String name;

    public String getName() {
        return name;
    }
}
