package be.urpi.software.xsi.request.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by daniel on 9/1/16.
 */
@Configuration
@EnableJpaRepositories(basePackages = {"be.urpi.software.xsi.request.repository"})
@ComponentScan(basePackages = {
        "be.urpi.software.xsi.request.service.impl"
})
public class RequestRepositoryConfig {
}
