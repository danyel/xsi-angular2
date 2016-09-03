package be.urpi.software.xsi.services.request.service.api;

import be.urpi.software.xsi.services.request.model.RequestAR;

import java.util.UUID;

/**
 * Created by daniel on 9/1/16.
 */
public interface RequestService {
    RequestAR create(RequestAR requestAR);

    RequestAR findRequest(UUID requestId);
}
