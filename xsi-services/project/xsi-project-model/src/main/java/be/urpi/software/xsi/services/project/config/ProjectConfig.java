package be.urpi.software.xsi.services.project.config;

import be.urpi.software.xsi.core.model.config.CoreModelConfig;
import be.urpi.software.xsi.services.project.model.ProjectAR;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by daniel on 9/2/16.
 */
@Configuration
@EntityScan(basePackageClasses = {ProjectAR.class})
@EnableJpaRepositories(basePackages = {"be.urpi.software.xsi.services.project.repository"})
@Import(value = {CoreModelConfig.class})
@ComponentScan(value = {"be.urpi.software.xsi.services.project.service.impl"})
public class ProjectConfig {
}
