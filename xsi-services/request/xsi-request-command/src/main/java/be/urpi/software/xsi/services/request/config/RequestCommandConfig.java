package be.urpi.software.xsi.services.request.config;

import be.urpi.software.xsi.core.cqrs.api.event.notify.EventNotifier;
import be.urpi.software.xsi.services.request.VoidEventNotifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by daniel on 29/08/16.
 */
@Configuration
@ComponentScan(value = "be.urpi.software.xsi.services.request.controller")
@Import(value = {RequestConfig.class})
public class RequestCommandConfig {
    @Bean
    EventNotifier eventNotifier() {
        return new VoidEventNotifier();
    }
}
