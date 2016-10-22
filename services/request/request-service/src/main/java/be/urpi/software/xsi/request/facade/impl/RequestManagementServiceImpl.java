package be.urpi.software.xsi.request.facade.impl;

import be.urpi.software.xsi.request.facade.api.RequestManagementService;
import be.urpi.software.xsi.request.facade.command.CreateRequest;
import be.urpi.software.xsi.request.facade.command.FindRequest;
import be.urpi.software.xsi.request.facade.dto.Request;
import be.urpi.software.xsi.request.facade.dto.RequestView;
import be.urpi.software.xsi.request.model.RequestAR;
import be.urpi.software.xsi.request.model.RequestQueryModel;
import be.urpi.software.xsi.request.service.api.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by daniel on 9/1/16.
 */
@Service
@Transactional
public class RequestManagementServiceImpl implements RequestManagementService {
    private final RequestService requestService;

    @Autowired
    public RequestManagementServiceImpl(RequestService requestService) {
        this.requestService = requestService;
    }

    @Override
    public Request createRequest(CreateRequest createRequest) {
        RequestAR requestAR = RequestAR.builder()
                .name(createRequest.getName())
                .project(UUID.fromString(createRequest.getProject()))
                .build();
        requestService.create(requestAR);
        return Request.builder()
                .name(createRequest.getName())
                .projectId(requestAR.getProject())
                .requestId(requestAR.getId())
                .build();

    }

    @Override
    public Request findRequest(FindRequest findRequest) {
        RequestAR requestAR = requestService.findRequest(findRequest.getRequestId());
        return Request.builder()
                .name(requestAR.getName())
                .projectId(requestAR.getProject())
                .requestId(requestAR.getId())
                .build();
    }

    @Override
    public List<RequestView> findAll() {
        List<RequestQueryModel> requestServiceAll = requestService.findAll();
        List<RequestView> requestViews = new ArrayList<>();
        requestServiceAll.forEach(requestQueryModel ->
                requestViews.add(RequestView.builder()
                        .projectName(requestQueryModel.getProjectName())
                        .requestName(requestQueryModel.getRequestName())
                        .uuid(requestQueryModel.getUuid())
                        .build()));
        return requestViews;
    }
}
