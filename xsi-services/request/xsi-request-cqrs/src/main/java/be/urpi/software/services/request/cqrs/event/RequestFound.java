package be.urpi.software.services.request.cqrs.event;

import java.util.UUID;

/**
 * Created by daniel on 9/2/16.
 */
public class RequestFound {
    private UUID requestId;
    private String name;
    private UUID projectId;

    public RequestFound() {
    }

    public RequestFound(UUID requestId, String name, UUID projectId) {
        this.requestId = requestId;
        this.name = name;
        this.projectId = projectId;
    }

    public UUID getRequestId() {
        return requestId;
    }

    public String getName() {
        return name;
    }

    public UUID getProjectId() {
        return projectId;
    }
}
