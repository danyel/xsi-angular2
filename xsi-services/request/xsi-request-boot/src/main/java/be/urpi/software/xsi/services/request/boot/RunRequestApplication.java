package be.urpi.software.xsi.services.request.boot;

import be.urpi.software.xsi.services.request.boot.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by daniel on 29/08/16.
 */
@SpringBootApplication
public class RunRequestApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(RunRequestApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.main(WebConfig.class);
    }
}
