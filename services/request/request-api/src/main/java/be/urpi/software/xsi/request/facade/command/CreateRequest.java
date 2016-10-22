package be.urpi.software.xsi.request.facade.command;

import be.urpi.software.xsi.core.cqrs.api.command.Command;
import lombok.*;

/**
 * Created by daniel on 9/1/16.
 */
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@EqualsAndHashCode
public class CreateRequest implements Command {
    private String name;
    private String project;
}
