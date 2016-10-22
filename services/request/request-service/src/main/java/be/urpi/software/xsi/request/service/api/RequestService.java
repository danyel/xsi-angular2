package be.urpi.software.xsi.request.service.api;

import be.urpi.software.xsi.request.model.RequestAR;
import be.urpi.software.xsi.request.model.RequestQueryModel;

import java.util.List;
import java.util.UUID;

/**
 * Created by daniel on 9/1/16.
 */
public interface RequestService {
    RequestAR create(RequestAR requestAR);

    RequestAR findRequest(UUID requestId);

    List<RequestQueryModel> findAll();
}
