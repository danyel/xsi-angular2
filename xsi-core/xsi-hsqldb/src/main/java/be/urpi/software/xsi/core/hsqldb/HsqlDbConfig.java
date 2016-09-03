package be.urpi.software.xsi.core.hsqldb;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/**
 * Created by daniel on 9/2/16.
 */
@Component
@ImportResource(value = {"classpath:hsqldb-context.xml"})
public class HsqlDbConfig {
}
