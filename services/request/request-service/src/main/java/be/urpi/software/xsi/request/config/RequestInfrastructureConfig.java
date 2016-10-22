package be.urpi.software.xsi.request.config;

import be.urpi.software.xsi.request.configuration.RequestModelConfig;
import be.urpi.software.xsi.request.service.config.RequestServiceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by daniel on 17/09/16.
 */
@Configuration
@Import({RequestModelConfig.class, RequestRepositoryConfig.class, RequestServiceConfig.class, RequestFacadeConfig.class})
public class RequestInfrastructureConfig {
}
