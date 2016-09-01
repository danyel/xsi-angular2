package be.urpi.software.xsi.services.request.controller;

import be.urpi.software.services.request.cqrs.command.CreateRequest;
import be.urpi.software.xsi.services.request.service.RequestManagerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by daniel on 9/1/16.
 */
@Api(value = "Request Management API", description = "Rest Controller for the Request Management")
@RestController
@RequestMapping(value = "/request-management-api")
public class RequestController {
    private final RequestManagerService requestManagerService;

    @Autowired
    public RequestController(RequestManagerService requestManagerService) {
        this.requestManagerService = requestManagerService;
    }

    @RequestMapping(method = POST)
    public void doCreateRequest(@RequestBody CreateRequest createRequest) {
        requestManagerService.createRequest(createRequest);
    }
}
