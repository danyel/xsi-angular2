package be.urpi.software.xsi.request.facade.command;

import be.urpi.software.xsi.core.cqrs.api.command.Command;
import lombok.*;

import java.util.UUID;

/**
 * Created by daniel on 9/2/16.
 */
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@EqualsAndHashCode
public class FindRequest implements Command {
    private UUID requestId;
}
