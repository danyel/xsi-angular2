package be.urpi.software.xsi.request.controller;

import be.urpi.software.xsi.request.facade.api.RequestManagementService;
import be.urpi.software.xsi.request.facade.command.CreateRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
