package be.urpi.software.xsi.core.model.api.sequence;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by daniel on 28/08/16.
 */
public class UuidSequence implements IdentifierGenerator {
    public static final String NAME = "be.urpi.software.xsi.core.model.api.sequence.UuidSequence";

    @Override
    public Serializable generate(SessionImplementor sessionImplementor, Object o) throws HibernateException {
        return UUID.randomUUID();
    }
}
