package be.urpi.software.xsi.request.facade.dto;

import lombok.*;

import java.io.Serializable;
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
public class Request implements Serializable {
    private UUID requestId;
    private String name;
    private UUID projectId;

}
