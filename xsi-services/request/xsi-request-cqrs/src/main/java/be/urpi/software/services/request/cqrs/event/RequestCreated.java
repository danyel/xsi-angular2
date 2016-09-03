package be.urpi.software.services.request.cqrs.event;

import be.urpi.software.xsi.core.cqrs.api.event.Event;
import be.urpi.software.xsi.core.util.builder.Builder;

import java.util.UUID;

/**
 * Created by daniel on 9/1/16.
 */
public class RequestCreated implements Event {
    private UUID id;

    public RequestCreated() {
    }

    public RequestCreated(RequestCreatedBuilder requestCreatedBuilder) {
        this.id = requestCreatedBuilder.id;
    }

    public static RequestCreatedBuilder builder() {
        return new RequestCreatedBuilder();
    }

    public UUID getId() {
        return id;
    }

    public static class RequestCreatedBuilder implements Builder<RequestCreated> {
        private UUID id;

        private RequestCreatedBuilder() {
        }

        public RequestCreatedBuilder withId(UUID id) {
            this.id = id;
            return this;
        }

        @Override
        public RequestCreated build() {
            return new RequestCreated(this);
        }
    }
}
