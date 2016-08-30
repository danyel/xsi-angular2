package be.urpi.software.xsi.core.cqrs.api.event.notify;

import be.urpi.software.xsi.core.cqrs.api.event.Event;

/**
 * Created by daniel on 27/08/16.
 */
public interface EventNotifier {
    <E extends Event> void notify(E event);
}
