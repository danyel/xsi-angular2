package be.urpi.software.xsi.services.project.cqrs.api.event;

import be.urpi.software.xsi.core.cqrs.api.event.Event;
import be.urpi.software.xsi.core.util.builder.Builder;

import java.util.UUID;

/**
 * Created by daniel on 27/08/16.
 */
public class ProjectCreated implements Event {
    private UUID uuid;

    public ProjectCreated() {
    }

    public ProjectCreated(ProjectCreatedBuilder projectCreatedBuilder) {
        this.uuid = projectCreatedBuilder.uuid;
    }

    public static ProjectCreatedBuilder builder() {
        return new ProjectCreatedBuilder();
    }

    public UUID getUuid() {
        return uuid;
    }

    public static class ProjectCreatedBuilder implements Builder<ProjectCreated> {
        private UUID uuid;

        public ProjectCreatedBuilder withUuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        @Override
        public ProjectCreated build() {
            return new ProjectCreated(this);
        }
    }
}
