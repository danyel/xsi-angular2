package be.urpi.software.xsi.services.request.controller;

import be.urpi.software.xsi.services.request.service.api.RequestService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by daniel on 9/10/16.
 */
@Api(value = "request-query-api")
@RestController
@RequestMapping(value = "/request-query-api", method = GET)
public class RequestQueryController {
    private final RequestService requestService;

    @Autowired
    public RequestQueryController(RequestService requestService) {
        this.requestService = requestService;
    }

    @RequestMapping(value = "/{id}")
    public ResponseEntity<?> get(@PathVariable(value = "id") String id){
        return new ResponseEntity<>(requestService.findRequest(UUID.fromString(id)), OK);
    }
}
