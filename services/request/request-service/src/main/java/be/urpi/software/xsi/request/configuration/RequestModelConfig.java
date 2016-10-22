package be.urpi.software.xsi.request.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by daniel on 17/09/16.
 */
@Configuration
@EntityScan(basePackages = {"be.urpi.software.xsi.request.model"})
public class RequestModelConfig {
}
