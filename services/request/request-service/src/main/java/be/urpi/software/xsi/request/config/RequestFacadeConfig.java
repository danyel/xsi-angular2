package be.urpi.software.xsi.request.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by daniel on 29/08/16.
 */
@Configuration
@ComponentScan(value = "be.urpi.software.xsi.request.facade.impl")
@Import(value = {RequestRepositoryConfig.class})
public class RequestFacadeConfig {
}
