package be.urpi.software.xsi.services.request.service.impl;

import be.urpi.software.xsi.services.request.model.RequestAR;
import be.urpi.software.xsi.services.request.repository.RequestRepository;
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
public class RequestServiceImpl implements RequestService {
    private final RequestRepository requestRepository;

    @Autowired
    public RequestServiceImpl(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @Override
    public RequestAR create(RequestAR requestAR) {
        return requestRepository.save(requestAR);
    }

    @Override
    public RequestAR findRequest(UUID requestId) {
        return requestRepository.findOne(requestId);
    }
}
