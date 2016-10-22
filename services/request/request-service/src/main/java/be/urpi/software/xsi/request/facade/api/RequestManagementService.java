package be.urpi.software.xsi.request.facade.api;

import be.urpi.software.xsi.request.facade.command.CreateRequest;
import be.urpi.software.xsi.request.facade.command.FindRequest;
import be.urpi.software.xsi.request.facade.dto.Request;
import be.urpi.software.xsi.request.facade.dto.RequestView;

import java.util.List;

/**
 * Created by daniel on 9/1/16.
 */
public interface RequestManagementService {
    Request createRequest(CreateRequest createRequest);

    Request findRequest(FindRequest findRequest);

    List<RequestView> findAll();
}
