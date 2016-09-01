package be.urpi.software.xsi.services.request.service;

import be.urpi.software.services.request.cqrs.command.CreateRequest;

/**
 * Created by daniel on 9/1/16.
 */
public interface RequestManagerService {
    void createRequest(CreateRequest createRequest);
}
