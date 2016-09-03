package be.urpi.software.xsi.services.request.service.api;

import be.urpi.software.services.request.cqrs.command.CreateRequest;
import be.urpi.software.services.request.cqrs.command.FindRequest;
import be.urpi.software.services.request.cqrs.event.RequestFound;

/**
 * Created by daniel on 9/1/16.
 */
public interface RequestManagementService {
    void createRequest(CreateRequest createRequest);

    RequestFound findRequest(FindRequest findRequest);
}
