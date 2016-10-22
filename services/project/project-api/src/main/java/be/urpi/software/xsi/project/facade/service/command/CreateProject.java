package be.urpi.software.xsi.project.facade.service.command;

import be.urpi.software.xsi.core.cqrs.api.command.Command;
import lombok.*;

/**
 * Created by daniel on 27/08/16.
 */
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class CreateProject implements Command {
    private String name;
}
