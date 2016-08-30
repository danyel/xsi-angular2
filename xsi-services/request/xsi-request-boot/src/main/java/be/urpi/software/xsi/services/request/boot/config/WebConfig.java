package be.urpi.software.xsi.services.request.boot.config;

import be.urpi.software.xsi.core.config.SwaggerConfig;
import be.urpi.software.xsi.services.request.config.RequestCommandConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by daniel on 29/08/16.
 */
@Configuration
@Import(value = {RequestCommandConfig.class, SwaggerConfig.class})
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
