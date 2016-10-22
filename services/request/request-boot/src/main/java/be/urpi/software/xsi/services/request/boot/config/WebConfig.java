package be.urpi.software.xsi.services.request.boot.config;

import be.urpi.software.xsi.core.config.SwaggerConfig;
import be.urpi.software.xsi.core.hsqldb.HsqlDbConfig;
import be.urpi.software.xsi.core.model.config.CoreModelConfig;
import be.urpi.software.xsi.request.config.RequestFacadeConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by daniel on 29/08/16.
 */
@Configuration
@Import(value = {RequestFacadeConfig.class, SwaggerConfig.class, HsqlDbConfig.class, CoreModelConfig.class})
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
