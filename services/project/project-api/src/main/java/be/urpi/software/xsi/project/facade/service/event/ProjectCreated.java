package be.urpi.software.xsi.project.facade.service.event;

import be.urpi.software.xsi.core.cqrs.api.event.Event;
import lombok.*;

import java.util.UUID;

/**
 * Created by daniel on 27/08/16.
 */
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ProjectCreated implements Event {
    private UUID uuid;
}
