package be.urpi.software.xsi.services.request.service.impl;

import be.urpi.software.services.request.cqrs.command.CreateRequest;
import be.urpi.software.services.request.cqrs.command.FindRequest;
import be.urpi.software.services.request.cqrs.event.RequestCreated;
import be.urpi.software.services.request.cqrs.event.RequestFound;
import be.urpi.software.xsi.core.cqrs.api.event.notify.EventNotifier;
import be.urpi.software.xsi.services.request.model.RequestAR;
import be.urpi.software.xsi.services.request.service.api.RequestManagementService;
import be.urpi.software.xsi.services.request.service.api.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * Created by daniel on 9/1/16.
 */
@Service
@Transactional
public class RequestManagementServiceImpl implements RequestManagementService {
    private final EventNotifier eventNotifier;
    private final RequestService requestService;

    @Autowired
    public RequestManagementServiceImpl(EventNotifier eventNotifier, RequestService requestService) {
        this.eventNotifier = eventNotifier;
        this.requestService = requestService;
    }

    @Override
    public void createRequest(CreateRequest createRequest) {
        RequestAR requestAR = RequestAR.builder()
                .withName(createRequest.getName())
                .withProject(UUID.fromString(createRequest.getProject()))
                .build();
        requestService.create(requestAR);
        eventNotifier.notify(RequestCreated.builder()
                .withId(requestAR.getId())
                .build());
    }

    @Override
    public RequestFound findRequest(FindRequest findRequest) {
        RequestAR requestAR = requestService.findRequest(findRequest.getRequestId());
        return new RequestFound(requestAR.getId(), requestAR.getName(), requestAR.getProject());
    }
}
