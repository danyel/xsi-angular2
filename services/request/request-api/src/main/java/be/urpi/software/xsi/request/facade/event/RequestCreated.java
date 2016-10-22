package be.urpi.software.xsi.request.facade.event;

import be.urpi.software.xsi.core.cqrs.api.event.Event;
import lombok.*;

import java.util.UUID;

/**
 * Created by daniel on 9/1/16.
 */
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@Getter
public class RequestCreated implements Event {
    private UUID id;

}
