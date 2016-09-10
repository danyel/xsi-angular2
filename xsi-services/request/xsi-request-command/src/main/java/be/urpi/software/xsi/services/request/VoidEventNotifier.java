package be.urpi.software.xsi.services.request;

import be.urpi.software.xsi.core.cqrs.api.event.Event;
import be.urpi.software.xsi.core.cqrs.api.event.notify.EventNotifier;

/**
 * Created by daniel on 9/2/16.
 */
public class VoidEventNotifier implements EventNotifier {
    @Override
    public <E extends Event> void notify(E event) {
        System.out.println(event.toString());
    }
}
