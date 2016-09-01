package be.urpi.software.xsi.services.request.service;

import be.urpi.software.services.request.cqrs.command.CreateRequest;
import be.urpi.software.services.request.cqrs.event.RequestCreated;
import be.urpi.software.xsi.core.cqrs.api.event.notify.EventNotifier;
import be.urpi.software.xsi.services.request.model.RequestAR;
import be.urpi.software.xsi.services.request.service.api.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by daniel on 9/1/16.
 */
@Service
public class RequestManagerServiceImpl implements RequestManagerService {
    private final EventNotifier eventNotifier;
    private final RequestService requestService;

    @Autowired
    public RequestManagerServiceImpl(EventNotifier eventNotifier, RequestService requestService) {
        this.eventNotifier = eventNotifier;
        this.requestService = requestService;
    }

    @Override
    public void createRequest(CreateRequest createRequest) {
        RequestAR requestAR = RequestAR.builder()
                .withName(createRequest.getName())
                .withProject(createRequest.getProject())
                .build();
        requestService.create(requestAR);
        eventNotifier.notify(RequestCreated.builder()
                .withId(requestAR.getId())
                .build());
    }
}
