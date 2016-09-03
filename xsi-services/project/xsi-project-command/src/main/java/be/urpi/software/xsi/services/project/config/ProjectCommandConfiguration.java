package be.urpi.software.xsi.services.project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by daniel on 27/08/16.
 */
@Configuration
@ComponentScan(basePackages = {
        "be.urpi.software.xsi.services.project.controller.impl",
        "be.urpi.software.xsi.services.project.service.impl"
})
@EnableWebMvc
@Import(value = {ProjectConfig.class})
@EnableTransactionManagement
public class ProjectCommandConfiguration {
}
