package be.urpi.software.xsi.core.model.config;

import be.urpi.software.xsi.core.model.api.audit.AuditService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Created by daniel on 9/1/16.
 */
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditService")
public class CoreModelConfig {
    @Bean(name = "auditService")
    public AuditService auditService() {
        return new AuditService();
    }
}
