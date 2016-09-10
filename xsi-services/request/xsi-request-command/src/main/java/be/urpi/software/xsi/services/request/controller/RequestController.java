package be.urpi.software.xsi.services.request.controller;

import be.urpi.software.services.request.cqrs.command.CreateRequest;
import be.urpi.software.services.request.cqrs.command.FindRequest;
import be.urpi.software.xsi.services.request.service.api.RequestManagementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

/**
 * Created by daniel on 9/1/16.
 */
@Api(value = "Request Management API", description = "Rest Controller for the Request Management")
@RestController
@RequestMapping(value = "/request-management-api")
public class RequestController {
    private final RequestManagementService requestManagementService;

    @Autowired
    public RequestController(RequestManagementService requestManagementService) {
        this.requestManagementService = requestManagementService;
    }

    @ApiOperation(value = "find")
    @RequestMapping(method = POST)
    public void doCreateRequest(@RequestBody CreateRequest createRequest) {
        requestManagementService.createRequest(createRequest);
    }
}
