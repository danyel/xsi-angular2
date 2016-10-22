package be.urpi.software.xsi.core.model.api.audit;

import org.springframework.data.domain.AuditorAware;

/**
 * Created by daniel on 9/1/16.
 */
public class AuditService implements AuditorAware<String> {
    @Override
    public String getCurrentAuditor() {
        return null;
    }
}
