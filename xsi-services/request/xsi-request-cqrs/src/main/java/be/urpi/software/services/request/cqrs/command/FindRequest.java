package be.urpi.software.services.request.cqrs.command;

import be.urpi.software.xsi.core.cqrs.api.command.Command;

import java.util.UUID;

/**
 * Created by daniel on 9/2/16.
 */
public class FindRequest implements Command {
    private UUID requestId;

    public UUID getRequestId() {
        return requestId;
    }
}
