package be.urpi.software.xsi.services.request.config;

import be.urpi.software.xsi.core.model.config.CoreModelConfig;
import be.urpi.software.xsi.services.request.model.RequestAR;
import be.urpi.software.xsi.services.request.repository.RequestRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by daniel on 9/1/16.
 */
@Configuration
@EntityScan(basePackageClasses = {RequestAR.class})
@EnableJpaRepositories(basePackageClasses = {RequestRepository.class})
@Import(value = {CoreModelConfig.class})
@ComponentScan(basePackages = {
        "be.urpi.software.xsi.services.request.service.impl"
})
public class RequestConfig {
}
