package be.urpi.software.xsi.request.service.impl;

import be.urpi.software.xsi.request.model.RequestAR;
import be.urpi.software.xsi.request.model.RequestQueryModel;
import be.urpi.software.xsi.request.repository.RequestQueryModelRepository;
import be.urpi.software.xsi.request.repository.RequestRepository;
import be.urpi.software.xsi.request.service.api.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * Created by daniel on 9/1/16.
 */
@Service
@Transactional
public class RequestServiceImpl implements RequestService {
    private final RequestRepository requestRepository;
    private final RequestQueryModelRepository requestQueryModelRepository;

    @Autowired
    public RequestServiceImpl(RequestRepository requestRepository, RequestQueryModelRepository requestQueryModelRepository) {
        this.requestRepository = requestRepository;
        this.requestQueryModelRepository = requestQueryModelRepository;
    }

    @Override
    public RequestAR create(RequestAR requestAR) {
        return requestRepository.save(requestAR);
    }

    @Override
    public RequestAR findRequest(UUID requestId) {
        return requestRepository.findOne(requestId);
    }

    @Override
    public List<RequestQueryModel> findAll() {
        return requestQueryModelRepository.findAll();
    }
}
