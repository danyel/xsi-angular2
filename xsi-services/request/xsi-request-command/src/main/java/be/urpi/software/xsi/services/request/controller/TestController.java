package be.urpi.software.xsi.services.request.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daniel on 29/08/16.
 */
@Api(value = "Test Controller", description = "Controller for test")
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @ApiOperation(value = "hello world")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity test() {
        return ResponseEntity.ok("Hello World");
    }
}
